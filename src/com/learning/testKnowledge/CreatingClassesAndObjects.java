package com.learning.testKnowledge;
class Car{
    String name;

    public Car(String carName){
        this.name = carName;
    }
    public String getName(){
        return name;
    }
    public void start(){
        System.out.println("car started");
    }
}
public class CreatingClassesAndObjects {
    public static void main(String[] args) {

        Car car = new Car("my car");
        car.start();
        System.out.println(car.getName());

    }
}
