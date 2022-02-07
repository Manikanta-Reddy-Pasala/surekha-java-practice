package com.learning.serializingArrays;

import com.learning.serializationAndDeserialization.Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {
  public static void main(String[] args) throws Exception {
    System.out.println("Reading");

    try (FileInputStream fi = new FileInputStream("people.txt")) { // this file will close automatically
      ObjectInputStream oi = new ObjectInputStream(fi);

      Person[] people = (Person[]) oi.readObject();
      // using array list
      ArrayList<Person> peopleList = (ArrayList<Person>) oi.readObject();
      for(Person result : people){
        System.out.println(result);
      }
      // using array list
      for(Person result : peopleList){
        System.out.println(result);
      }
      oi.close();

    }catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
