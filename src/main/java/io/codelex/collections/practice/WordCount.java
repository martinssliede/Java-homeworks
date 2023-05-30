package io.codelex.collections.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {

        try {
            final Path path = Paths.get(Histogram.class.getResource(file).toURI());
            List<String> allFileLines = Files.readAllLines(path, charset);

            int lineCount = allFileLines.size();
            int wordCount = 0;
            int charCount = 0;

            for (String line : allFileLines) {
                charCount += line.length();

                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty() && Character.isLetterOrDigit(word.charAt(0))) {
                        wordCount++;
                    }
                }
            }
            System.out.println("Line count: " + lineCount);
            System.out.println("Word count: " + wordCount);
            System.out.println("Char count: " + charCount);
        } catch (IOException e) {
            System.out.println("Error reading the file " + e.getMessage());
        }
    }
}
