package com.learning.serializationAndDeserialization;

public class Notes {
/*
What Are Serialization and Deserialization?
In Java, we create several objects that live and die accordingly, and every object will certainly die when the JVM dies.
But sometimes, we might want to reuse an object between several JVMs (or) we might want to transfer an object to another
machine over the network.

Well, serialization allows us to convert the state of an object into a byte stream, which then can be saved into a file
on the local disk or sent over the network to any other machine. And deserialization allows us to reverse the process,
which means reconverting the serialized byte stream to an object again.

In simple words, object serialization is the process of saving an object's state to a sequence of bytes and
deserialization is the process of reconstructing an object from those bytes.
Generally, the complete process is called serialization,

The serialization process is platform independent, an object serialized on one platform can be deserialized on a
different platform.

To serialize and deserialize, our object to a file we need to call
ObjectOutputStream.writeObject() and ObjectInputStream.readObject()

Any class that implements Serializable interface directly or through its parent can be serialized, and classes
that do not implement Serializable can not be serialized.

Java's default serialization process is fully recursive, so whenever we try to serialize one object, the serialization
 process try to serialize all the fields (primitive and reference) with our class (except static and transient fields).

 When a class implements the Serializable interface, all its sub-classes are serializable as well. But when an object
 has a reference to another object, these objects must implement the Serializable interface separately. If our class is
  having even a single reference to a non-Serializable class then JVM will throw NotSerializableException.

What Is serialVersionUID? And Why Should We Declare It?
By default, the JVM associates a version number to each serializable class to control the class versioning. It is used
to verify that the serialized and deserialized objects have the same attributes and thus are compatible with
deserialization. The version number is maintained in a field called serialVersionUID. If a serializable class doesn't
declare a serialVersionUID, the JVM will generate one automatically at run-time.

It is highly recommended that each serializable class declares its serialVersionUID as the generated one is compiler
dependent and thus may result in unexpected InvalidClassExceptions.

*/
    }


