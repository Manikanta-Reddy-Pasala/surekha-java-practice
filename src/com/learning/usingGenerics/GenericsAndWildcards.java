package com.learning.usingGenerics;

import java.util.ArrayList;

class Machine{
    @Override
    public String toString() {
        return "I am a Machine";
    }
}
class Camera extends Machine{
    @Override
    public String toString() {
        return "I am a Camera";
    }

}
public class GenericsAndWildcards {
    public static void main(String[] args) {
        //ArrayList<String> list = new ArrayList<String>();//here we can also give <class names> e.g:
        ArrayList<Machine> list = new ArrayList<Machine>();
        //list.add("cat");// and we can add Machine objects e.g:
        list.add(new Machine());
        //list.add("dog");
        list.add(new Machine());


        ArrayList<Camera> cameraList = new ArrayList<Camera>();
        cameraList.add(new Camera());
        cameraList.add(new Camera());


        showList(list);
        showAnotherList(cameraList);
        showAList(list);// in this method below we have used wild card, so we can access both list and cameraList

    }

    // public static void showList(ArrayList<String> list) {//need to change String to Machine
    public static void showList(ArrayList<Machine> list) {
        // for (String result : list) { // need to change String to Machine
        for (Machine result : list) {

            System.out.println(result);
        }

        //or if we print directly list
        System.out.println(list);

    }

    public static void showAnotherList(ArrayList<Camera> cameraList) {
        // for (String result : list) { // need to change String to Machine
        for (Camera result2 : cameraList) {

            System.out.println(result2);
        }
        //here instead of writing second method we can pass any arraylist if we use wildcard method e.g:
        //    public static void showAnotherList(ArrayList<?> cameraList) { ? = wildcard
        // for (Object result2 : cameraList) { Object is the ultimate parent object in any java class hence
        // generally Object is used

    }
    public static void showAList (ArrayList< ? > list){
        for (Object result2 : list) {
            System.out.println(result2);

        }
    }
}

