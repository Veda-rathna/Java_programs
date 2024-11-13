package AJP_Practicals;

//Implement a program that uses advanced I/O techniques

import java.io.*;
import java.util.*;

class AdvancedIOExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String testCase = scanner.nextLine().trim();

        switch (testCase) {

            case "test PipedStreams":
                if (scanner.hasNextLine()) {
                    String input = scanner.nextLine();
                    testPipedStreams(input);
                } else {
                    System.err.println("Please provide input for the PipedStreams test case.");
                }
                break;

            case "test SequenceInputStream":
                if (scanner.hasNextLine()) {
                    String input1 = scanner.nextLine();
                    if (scanner.hasNextLine()) {
                        String input2 = scanner.nextLine();
                        testSequenceInputStream(input1, input2);
                    } else {
                        System.err.println("Please provide two inputs for the SequenceInputStream test case.");
                    }
                }
                break;

            case "test PushbackInputStream":
                if (scanner.hasNextLine()) {
                    String input = scanner.nextLine();
                    testPushbackInputStream(input);
                } else {
                    System.err.println("Please provide input for the PushbackInputStream test case.");
                }
                break;

            case "test MultiplePushbackInputStream":
                if (scanner.hasNextLine()) {
                    String input = scanner.nextLine();
                    testMultiplePushbackInputStream(input);
                } else {
                    System.err.println("Please provide input for the MultiplePushbackInputStream test case.");
                }
                break;

            case "test MultipleSequenceInputStream":
                List<String> inputs = new ArrayList<>();
                while (scanner.hasNextLine()) {
                    inputs.add(scanner.nextLine());
                }
                if (inputs.isEmpty()) {
                    System.err.println("Please provide multiple inputs for the MultipleSequenceInputStream test case.");
                } else {
                    testMultipleSequenceInputStream(inputs.toArray(new String[0]));
                }
                break;

            default:
                System.err.println("Unknown test case: " + testCase);
                break;
        }

        // Close the scanner
        scanner.close();
    }

    // Method to demonstrate PipedStream
    public static void testPipedStreams(String input) {
        try (PipedOutputStream pos = new PipedOutputStream();
             PipedInputStream pis = new PipedInputStream(pos)) {

            pos.write(input.getBytes());
            pos.close();

            BufferedReader reader = new BufferedReader(new InputStreamReader(pis));
            String result = reader.readLine();
            System.out.println("Read from PipedInputStream: " + result);
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to demonstrate SequenceInputStream
    public static void testSequenceInputStream(String input1, String input2) {
        try {
            ByteArrayInputStream bais1 = new ByteArrayInputStream(input1.getBytes());
            ByteArrayInputStream bais2 = new ByteArrayInputStream(input2.getBytes());

            SequenceInputStream sis = new SequenceInputStream(bais1, bais2);
            BufferedReader reader = new BufferedReader(new InputStreamReader(sis));

            StringBuilder result = new StringBuilder();
            int ch;
            while ((ch = reader.read()) != -1) {
                result.append((char) ch);
            }
            System.out.println("Concatenated Stream: " + result.toString());
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to demonstrate PushbackInputStream
    public static void testPushbackInputStream(String input) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
             PushbackInputStream pis = new PushbackInputStream(bais)) {

            int ch = pis.read();
            System.out.println("Initial Read: " + (char) ch);

            pis.unread(ch);
            ch = pis.read();
            System.out.println("After Pushback and Read: " + (char) ch);

            pis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to demonstrate Multiple PushbackInputStreams
    public static void testMultiplePushbackInputStream(String input) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes());
             PushbackInputStream pis = new PushbackInputStream(bais)) {

            int ch = pis.read();
            System.out.println("Initial Read: " + (char) ch);

            pis.unread(ch);
            ch = pis.read();
            System.out.println("After First Pushback and Read: " + (char) ch);

            pis.unread(ch);
            ch = pis.read();
            System.out.println("After Second Pushback and Read: " + (char) ch);

            pis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to demonstrate Multiple SequenceInputStreams
    public static void testMultipleSequenceInputStream(String... inputs) {
        try {
            List<ByteArrayInputStream> streams = new ArrayList<>();
            for (String input : inputs) {
                streams.add(new ByteArrayInputStream(input.getBytes()));
            }

            Enumeration<InputStream> enumeration = new Enumeration<InputStream>() {
                private final Iterator<ByteArrayInputStream> iterator = streams.iterator();

                @Override
                public boolean hasMoreElements() {
                    return iterator.hasNext();
                }

                @Override
                public InputStream nextElement() {
                    return iterator.next();
                }
            };

            SequenceInputStream sis = new SequenceInputStream(enumeration);
            BufferedReader reader = new BufferedReader(new InputStreamReader(sis));

            StringBuilder result = new StringBuilder();
            int ch;
            while ((ch = reader.read()) != -1) {
                result.append((char) ch);
            }
            System.out.println("Concatenated Stream: " + result.toString());
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
