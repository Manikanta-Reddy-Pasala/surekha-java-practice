package com.learning.polymorphism;

public class App {
    public static void main(String[] args) {

        Plant plant1 = new Plant();
        Tree tree1 = new Tree();
        Tree tree2 = new Tree();

        Plant plant2 = tree1; // parent class can be assigned to child class & it is called upcasting
       // Tree tree3 = (Tree)plant1; // this can't be done because child class may contain more methods than parent class
        // assigning child class to parent class is called down casting

       plant2.grow();

       tree1.shedLeaves();

       doGrow(tree1);// can use child in place of parent with polymorphism

    }

    public static void doGrow (Plant plant1){
        plant1.grow();
    }
}

