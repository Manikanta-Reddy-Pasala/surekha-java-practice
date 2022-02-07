package com.learning.fileReadingAndWriting;

import java.io.*;

public class FileReadingExample {
    public static void main(String[] args) {
        File file = new File("test.txt"); // if we need to read this file line by line we need to have a file
        // reader and buffered reader
        //FileReader fr = new FileReader(file);// we can give this directly in the path name without creating another variable fr
        try (BufferedReader br = new BufferedReader(new FileReader(file))) { // called try with resources only from Java7
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        } catch (IOException e) {
            System.out.println("can't read the file: " + file.toString());
        }

    }
}
