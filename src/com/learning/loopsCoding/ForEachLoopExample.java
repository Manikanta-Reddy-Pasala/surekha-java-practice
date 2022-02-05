package com.learning.loopsCoding;

public class ForEachLoopExample {
    public static void main(String[] args) {
        int[] array = {5,3,2,6,7};
        int sum = 0;
        for(int currentElement : array){  //current element each time takes 1 element in the array until the array ends
            sum += currentElement;
            System.out.println(sum);
            }
//        for(int i : array){
//            System.out.println(i);
//            i++;
//
//        }
        /*
        for-each loop is used to traverse array or collection in Java. It is easier to use than simple for loop
         because we don't need to increment value and use subscript notation.
        It works on the basis of elements and not the index. It returns element one by one in the defined variable.

        Syntax:
             for(data_type variable : array_name){
             code to be executed }
        */
    }
}
