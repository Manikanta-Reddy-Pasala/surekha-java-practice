package com.learning.classesAndObjects;

class Dog {
    private String name;
    private int age;

    public void setName(String dogName){ // in the place of dogName we can use any variable name
        this.name = dogName;
    }
    public void setAge(int dogAge){
        this.age = dogAge;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setInfo(String name, int age){
        setName(name);
        setAge(age);
    }

    public String getInfo(){
        return name + age;

    }

}
public class GetSetMethodExample {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        // dog1.name = "puppy";
       // dog1.age = 6;

        dog1.setName("puppy");
        dog1.setAge(6);


        Dog dog2 = new Dog();
        // dog2.name = "pinky";
       // dog2.age = 7;
        // can use set method to use private variables outside the class like name,age
        dog2.setName("pinky");
        dog2.setAge(7);
        dog2.setInfo("dog " , 7);

        System.out.println("My name is "+ dog1.getName());
        System.out.println(dog2.getAge() + " years");
        System.out.println(dog2.getInfo());

    }
}
