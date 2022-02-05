package com.learning.anonymousClass;

class Machine {
    public void start() {
        System.out.println("Machine Started");
    }
}
    //creating interface and overriding with anonymous interface

    interface Plant{
        void grow(); // interface always contains empty body

    }


public class AnonymousClassExample {
    public static void main(String[] args) {

        Machine machine1 = new Machine(){
            @Override public void start(){ //over riding with anonymous class method
                System.out.println("Car Started");
            }
        };
        machine1.start();// it takes the method that is present in class Machine but if we override the same method
        //here then that overridden method does not contain any class hence it is called Anonymous class.

        //creating interface and overriding with anonymous class
        Plant plant1 = new Plant(){ //in interface usually objects can't be initiated but with the below statement this
            //can be done
           public void grow() {
                System.out.println("plant growing");
            }

        };
//        Plant plant2 = () -> { // using lambda in anonymous class where only 1 method is possible
//            System.out.println("plant growing");
//        } ;



        plant1.grow();
    }
}
