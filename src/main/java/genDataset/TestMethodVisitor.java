package genDataset;

import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.comments.LineComment;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import org.json.simple.JSONObject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

import static java.lang.String.valueOf;

public class TestMethodVisitor extends VoidVisitorAdapter<Void> {
    private String description = "";
    private String URL = "";

    private String outputFile = "";

    private ArrayList<String> codeBlock = new ArrayList<String> ();
    private ArrayList<String> comment = new ArrayList<String> ();

    TestMethodVisitor (String outputFile){
        this.outputFile = outputFile;
    }

    public String getDescription() {
        return description;
    }

    public String getURL() {
        return URL;
    }

    public ArrayList<String> getCodeBlock() {
        return codeBlock;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCodeBlock(ArrayList<String> codeBlock) {
        this.codeBlock = codeBlock;
    }
    public void resetCodeBlock(){
        this.codeBlock.clear ();
    }
    public void resetComment(){
        this.comment.clear ();
    }
    @Override
    public void visit(MethodDeclaration md, Void arg) {
        super.visit (md, arg);
        // if md have @Test
        if (md.getAnnotations ().toString ().contains ("@Test")) {

            md.getAllContainedComments ().forEach (comment -> {
                if (comment instanceof LineComment){
                    String content = ((LineComment) comment).getContent ();
                    if (!Objects.equals (HandleNodeData.isWebURL (content), "")){
                        this.URL = HandleNodeData.isWebURL (content);
                    }
                    if (!Objects.equals (HandleNodeData.isDescriptionNode (content), "")){
                        this.description = HandleNodeData.isDescriptionNode (content);
                    }
                }
            });
            // get body
            BlockStmt blockStmt = md.getBody ().orElse (null);
            if (blockStmt != null) {
                // iterator statement in body
                for (Statement statement : blockStmt.getStatements ()) {
                    ArrayList<String> result = HandleNodeData.isActionNode (statement.toString ());
                    String script = result.get (result.size () - 1);
                    result.remove (result.size () - 1);
                    if (result.size () == 0){
                        System.out.println ();
                        this.codeBlock.add (script);
                    }else {
                        if (!codeBlock.isEmpty ()) {
//                            System.out.println (codeBlock + "XXXXXXX");
                            StringBuilder stringBuilder = new StringBuilder ();
                            for (String codeLine : this.codeBlock) {
                                stringBuilder.append (codeLine).append ("\n");
                            }
                            for (String cmt : comment) {
                                JSONObject jsonObject = new JSONObject ();
                                jsonObject.put ("aURL", this.URL);
                                jsonObject.put ("bSummary", this.description);
                                jsonObject.put ("description", cmt);
                                jsonObject.put ("script", stringBuilder.toString ());
                                writeToFile (jsonObject);
                            }
                        }
//                        System.out.println (stringBuilder.toString () + "XXX");
                        this.resetCodeBlock ();
                        this.resetComment ();
                        this.codeBlock.add (script);
                        for (String cmt : result) {
                            this.comment.add (cmt);
                        }
                    }
                }
                if(!this.codeBlock.isEmpty ()){
//                    System.out.println (codeBlock + "XXXXXXX");
                    StringBuilder stringBuilder = new StringBuilder ();
                    for (String codeLine : this.codeBlock) {
                        stringBuilder.append (codeLine).append ("\n");
                    }
                    for (String cmt : comment) {
                        JSONObject jsonObject = new JSONObject ();
                        jsonObject.put ("aURL", this.URL);
                        jsonObject.put ("bSummary", this.description);
                        jsonObject.put ("description", cmt);
                        jsonObject.put ("script", stringBuilder.toString ());
                        writeToFile (jsonObject);
                    }
                }
            }
        }
    }

    private void writeToFile(JSONObject jsonObject) {
        try {
            FileWriter fileWriter = new FileWriter(this.outputFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            jsonObject.writeJSONString (bufferedWriter);
            bufferedWriter.newLine(); // Xuống dòng sau mỗi lần phân tách
            bufferedWriter.close(); // Đóng BufferedWriter
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

}
