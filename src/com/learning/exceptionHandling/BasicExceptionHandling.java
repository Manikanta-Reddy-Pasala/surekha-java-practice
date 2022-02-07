package com.learning.exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BasicExceptionHandling {
    /*
    The try-catch is the simplest method of handling exceptions. Put the code you want to run in the try block,
    and any Java exceptions that the code throws are caught by one or more catch blocks.

This method will catch any type of Java exceptions that get thrown. This is the simplest mechanism for handling exceptions.

try {
  // block of code that can throw exceptions
} catch (Exception ex) {
  // Exception handler
}
     */
    public static void main(String[] args) {
        File file = new File("test.txt"); // import
        try {
            FileReader fr = new FileReader(file); // import
            // below code will not be executed if an exception is thrown, if no exception then all lines below are executed
            System.out.println("continuing");
        } catch (FileNotFoundException e) { //import
            // e.printStackTrace(); usually this is default line we can write whatever we want e.g: below
            System.out.println("file not found: " + file.toString());
        }
        // after catching the exception then code execution continues below

        System.out.println("Finished");
    }
}
/*
You can also specify specific exceptions you would like to catch. This allows you to have dedicated code to recover
from those errors. For example, some Java errors returned from a REST API are recoverable and others are not.
 This allows you to treat those conditions separately.

A try block can be followed by one or more catch blocks, each specifying a different type. The first catch block that
 handles the exception class or one of its superclasses will be executed. So, make sure to catch the most
 specific class first.
 try {
  // block of code that can throw exceptions
} catch (ExceptionType1 ex1) { // first we need to catch child class exceptions then we need to move to parent class
  // exception handler for ExceptionType1
} catch (ExceptionType2 ex2) {
  // Exception handler for ExceptionType2
}
If an exception occurs in the try block, the exception is thrown to the first catch block. If not, the Java exception
passes down to the second catch statement. This continues until the exception either is caught or falls through all
catches.

The finally - block:
Any code that must be executed irrespective of occurrence of an exception is put in a finally - block. In other words,
a finally - block is executed in all circumstances. For example, if you have an open connection to a database or file,
use the finally - block to close the connection even if the try block throws a Java exception.

try {
  // block of code that can throw exceptions
} catch (ExceptionType1 ex1) {
  // exception handler for ExceptionType1
} catch (ExceptionType2 ex2) {
  // Exception handler for ExceptionType2
} finally {
  // finally block always executes

 */
