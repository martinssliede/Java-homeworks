package io.codelex.ClassTest14_06.Exercise4;

import java.io.*;

public class FileReverser {
    public static void main(String[] args) {
        String filePath = "/Users/martins/Desktop/Document.txt";

        try {
            File originalFile = new File(filePath);
            BufferedReader reader = new BufferedReader(new FileReader(originalFile));
            StringBuilder builder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                builder.append(line).append(System.lineSeparator());
            }
            reader.close();
            String originalContent = builder.toString();

            String reversedContent = new StringBuilder(originalContent).reverse().toString();
            String reversedTitle = new StringBuilder(originalFile.getName()).reverse().toString();

            File reversedFile = new File(originalFile.getParent(), reversedTitle);
            BufferedWriter writer = new BufferedWriter(new FileWriter(reversedFile));
            writer.write(reversedContent);
            writer.close();

            System.out.println("File created successfully at: /Users/martins/Desktop");

        } catch (IOException e) {
            System.out.println("Error occurred!" + e.getMessage());
        }
    }
}
