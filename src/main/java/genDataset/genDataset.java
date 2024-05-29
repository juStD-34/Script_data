package genDataset;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import java.io.*;
public class genDataset {

    public static void generateTest(String inputFolderPath, String outputFile) {
        System.out.println("Hello world!");
        File fileOrFolder = new File(inputFolderPath);

        if (fileOrFolder.exists()) {
            if (fileOrFolder.isDirectory()) {
                // folderPath is folder
                processDirectory(fileOrFolder, outputFile);
            } else if (fileOrFolder.isFile()) {
                // folderPath is filePath
                processFile(fileOrFolder.getAbsolutePath(), outputFile);
            }
        } else {
            System.out.println("The path does not exist.");
        }
    }

    private static void processDirectory(File directory, String outputFile) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    // still is folder
                    processDirectory(file, outputFile);
                } else if (file.isFile()) {
                    processFile(file.getAbsolutePath(), outputFile);
                }
            }
        }
    }

    private static void processFile(String filePath, String outputFile) {
        try {
            try (FileInputStream rawCode = new FileInputStream(filePath)) {
                JavaParser javaParser = new JavaParser();
                CompilationUnit cu = javaParser.parse(rawCode).getResult().orElse(null);
                if (cu != null) {
                    TestMethodVisitor visitor = new TestMethodVisitor(outputFile);
                    visitor.visit(cu, null);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
