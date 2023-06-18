package io.codelex.triviagame;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Trivia Game!");
        System.out.println("Try to guess correct answer typing the desired number as answer for question provided. Game ends if your answer is wrong, or after the 20th turn.");
        System.out.println();

        int gameSize = 21;
        int count = 1;
        boolean correct = true;
        while (correct && count <= gameSize) {

            try {
                // http://numbersapi.com/random/trivia

                URL url = new URL("http://numbersapi.com/random/trivia");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.connect();

                int responseCode = connection.getResponseCode();
                if (responseCode != 200) {
                    throw new RuntimeException("Connection is not made, code: " + responseCode);
                } else {
                    StringBuilder builder = new StringBuilder();
                    Scanner scanner = new Scanner(url.openStream());

                    while (scanner.hasNext()) {
                        builder.append(scanner.nextLine());
                    }
                    scanner.close();

                    String str = builder.toString();
                    String[] words = str.split(" ");
                    String answer = words[0];
                    StringBuilder output = new StringBuilder("Guess ");
                    for (int i = 2; i < words.length; i++) {
                        output.append(words[i]).append(" ");
                    }

                    System.out.println("Question " + count);
                    System.out.println(output);

                    List<String> shuffled = new ArrayList<>();
                    shuffled.add(String.valueOf(RandomNumber.random()));
                    shuffled.add(String.valueOf(RandomNumber.random()));
                    shuffled.add(answer);
                    Collections.shuffle(shuffled);

                    for (String a : shuffled) {
                        System.out.println(a);
                    }

                    Scanner inputScanner = new Scanner(System.in);
                    String userAnswer = inputScanner.nextLine();

                    if (userAnswer.equals(answer)) {
                        count++;
                        correct = true;
                        System.out.println("Correct!");
                        System.out.println();
                    } else {
                        correct = false;
                        System.out.println("False!");
                        if (count == 1) {
                            System.out.println("Thanks for playing, correct answers: 0");
                            break;
                        } else {
                            System.out.println("Thanks for playing, correct answers: " + (count - 1));
                            System.out.println(output);
                            System.out.println("CORRECT ANSWER: " + answer);
                            break;
                        }
                    }
                    if (count == gameSize) {
                        System.out.println("YOU ARE ON FIRE! All answers were correct!");
                        break;
                    }
                    
//                JSONParser parser = new JSONParser();
//                JSONArray dataObject = (JSONArray) parser.parse(String.valueOf(builder));
//
//                System.out.println(dataObject.get(0));
//
//                JSONObject number = (JSONObject) dataObject.get(1);
//                System.out.println(number);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
