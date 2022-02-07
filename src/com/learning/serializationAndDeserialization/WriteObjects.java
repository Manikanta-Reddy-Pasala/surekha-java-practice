package com.learning.serializationAndDeserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
    public static void main(String[] args){
        System.out.println("writing methods");

        Person Aadhya = new Person(5, "Aadhya");
        Person Mani = new Person(6, "Mani");

        System.out.println(Aadhya);
        System.out.println(Mani);

       try (FileOutputStream fs = new FileOutputStream("people.txt")) { // this file will close automatically
           ObjectOutputStream os = new ObjectOutputStream (fs);

           os.writeObject(Aadhya);
           os.writeObject(Mani);

           os.close();

        } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
