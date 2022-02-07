package com.learning.serializingArrays;

import com.learning.serializationAndDeserialization.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
  public static void main(String[] args){
    System.out.println("writing methods");

    Person[] people = {new Person(1,"Aadhya"), new Person(2,"Mani"),new Person(3,"Surekha")};
    // using array list
    ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));

    try (FileOutputStream fs = new FileOutputStream("people.txt")) { // this file will close automatically
      ObjectOutputStream os = new ObjectOutputStream (fs);

      os.writeObject(people);
      os.writeObject(peopleList);
      for(Person result : people){
        System.out.println(result);
      }
      // using array list
      for(Person result : peopleList){
        System.out.println(result);
      }
      // using array list
      os.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
