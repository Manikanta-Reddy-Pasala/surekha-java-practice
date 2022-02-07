package com.learning.fileReadingAndWriting;

import java.io.*;

public class FileWriting {
    public static void main(String[] args) {
        //same as file reading method with small changes like instead of FileReader, use FileWriter and instead of
        //using BufferedReader, use BufferedWriter only applies to text files
        File file = new File("test.txt"); //create file

        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            br.write("This is line one.");
            br.newLine();
            br.write("This is line two.");
            br.newLine();
            br.write("last line");




        } catch (IOException e) {
            System.out.println("can't read the file: " + file.toString());
        }

    }
}
