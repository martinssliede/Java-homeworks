package io.codelex.collections.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        System.out.println(scores);

        int[] ranges = new int[11];
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
        String line;
        while ((line = reader.readLine()) != null) {
            int score = Integer.parseInt(line);
            int rangeIndex = score / 10;
            ranges[rangeIndex]++;
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        for (int i = 0; i < ranges.length; i++) {
            String range = String.format("%02d - %02d: ", i * 10, 1 * 10 + 9);
            String asterisks = "*".repeat(ranges[i]);
            System.out.println(range + " " + asterisks);
        }
        System.out.println("100 : " + "*".repeat(ranges[10]));
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
