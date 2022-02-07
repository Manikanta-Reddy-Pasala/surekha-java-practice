package com.learning.serializationAndDeserialization;

import java.io.*;

public class ReadObjects {
    public static void main(String[] args) throws Exception {
        System.out.println("Reading");

        try (FileInputStream fi = new FileInputStream("people.txt")) { // this file will close automatically
            ObjectInputStream oi = new ObjectInputStream(fi);

            Person person1 = (Person) oi.readObject();
            Person person2 = (Person) oi.readObject();

            oi.close();

            System.out.println(person1);
            System.out.println(person2);


        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
