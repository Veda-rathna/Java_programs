package AJP_Practicals;

//Read And Write Using StringTokenizer Class

import java.io.*;
import java.util.StringTokenizer;

class SentenceTokenizerFile {

    public static void main(String[] args) {
        // File paths
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        // Reading the file content
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(" ");
            }
        } catch (FileNotFoundException fe) {
            System.out.println("File not found: " + inputFilePath);
            return;
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        // Tokenizing the content into sentences
        String text = content.toString();
        StringTokenizer tokenizer = new StringTokenizer(text, ".?!");

        // Writing tokenized sentences to the output file
        try (FileWriter fw = new FileWriter(outputFilePath)) {
            while (tokenizer.hasMoreTokens()) {
                String sentence = tokenizer.nextToken().trim();
                fw.write(sentence + System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }

        // Reading and printing the tokenized sentences from the output file
        try (BufferedReader reader = new BufferedReader(new FileReader(outputFilePath))) {
            String sentence;
            while ((sentence = reader.readLine()) != null) {
                System.out.println(sentence);
            }
        } catch (FileNotFoundException fe) {
            System.out.println("File not found: " + outputFilePath);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

