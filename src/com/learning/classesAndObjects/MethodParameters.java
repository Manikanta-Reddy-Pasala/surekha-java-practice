package com.learning.classesAndObjects;
  class Robot {
      void speak(String name) {
          System.out.println("My name is  " + name);
      }

      void height (int inches){
          System.out.println("My height is  "+ inches + " inches");
      }

      void move (String direction, int distance){
          System.out.println("Move " + distance+ " meters towards " + direction);
      }
  }

public class MethodParameters {
    public static void main(String[] args) {

        Robot robot = new Robot();
        robot.speak ("Robo");
        robot.height (6);
        robot.move("east", 20);

        String greeting = "hello there";// can create any string / int values to that particular method
        robot.speak(greeting);

    }
}
