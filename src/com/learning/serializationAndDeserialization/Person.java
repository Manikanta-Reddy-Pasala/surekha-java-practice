package com.learning.serializationAndDeserialization;

import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    private String name;

    //private String serialVersionUID = "";

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [id = " + id + ", name= " + name +" ]" ;
    }
}
