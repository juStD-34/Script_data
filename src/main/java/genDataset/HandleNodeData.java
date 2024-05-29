package genDataset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class HandleNodeData {
    public static  String isWebURL(String stringNode) {
        String webURLFind = "Web URL";
        String webURLFind2 = "WEB URL";
        String webURL = "";
        if (stringNode.contains (webURLFind) || stringNode.contains (webURLFind2)){
            webURL = norrmalizeWebURL (stringNode);
        }
        return webURL;
    }
    private static String norrmalizeWebURL(String webURL){

        webURL = webURL.replace ("WEB URL: ", "");
        webURL = webURL.replace ("WEB URL : ", "");
        webURL = webURL.replace ("WEB URL ", "");
        webURL = webURL.replace ("Web URL: ", "");
        webURL = webURL.replace ("Web URL : ", "");
        webURL = webURL.replace ("Web URL ", "");
        webURL.trim ();
        return webURL;
    }

    public static String isDescriptionNode(String stringNode){
        String generalDescriptionString = "GENERAL DESCRIPTION" ;
        String generalDescriptionString2 = "General Description";
        String generalDescription = "" ;
        if (stringNode.contains (generalDescriptionString) || stringNode.contains (generalDescriptionString2)) {
            generalDescription = normalizeDescription (stringNode);
        }
//        System.out.println ("Description :" + generalDescription);
        return generalDescription;
    }

    private static String normalizeDescription(String Description){
        Description = Description.replace ("GENERAL DESCRIPTION:", "");
        Description = Description.replace ("GENERAL DESCRIPTION : ", "");
        Description = Description.replace ("General Description : ", "");
        Description = Description.replace ("General Description:", "");
        Description.trim ();
        return Description;
    }
    public static ArrayList<String> isActionNode(String stringNode){
        ArrayList<String> results = new ArrayList<String> ();

        Pattern pattern = Pattern.compile("//\\s*Action:\\s*(.+)");

        Matcher matcher = pattern.matcher(stringNode);

        while (matcher.find ()){
            results.add(matcher.group (1));
        }
        String[] lines = stringNode.split ("\n");
//        if (results.isEmpty ()){
//            return results ;
//        }
        String code = lines[lines.length - 1];
        results.add (code);

        return results;
    }

    public static int countMatches(String mainString, String whatToFind){
        String tempString = mainString.replaceAll(whatToFind, "");

        int times = (mainString.length()-tempString.length())/whatToFind.length();
        return times;
    }
}
