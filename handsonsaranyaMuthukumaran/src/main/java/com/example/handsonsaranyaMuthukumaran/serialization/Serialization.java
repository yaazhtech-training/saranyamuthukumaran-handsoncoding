package com.example.handsonsaranyaMuthukumaran.serialization;
/*what is mean by serialization?Transient keyword?
* Serial_version_UID number
*It is the process of converting an object into byte stream form.

It is a marker interface which means it doesn't have any data members and methods.x
*
*A variable defined with transient keyword is not serialized during serialization process.This variable will be initialized with default value during deserialization.Default value is zero.
* Serializable class can declare its own UID explicitly by declaring a field name. It must be static, final and of type long. i.e

ANY-ACCESS-MODIFIER static final long serialVersionUID=42L
*
*  DESERIALIZATION :

It is the process of converting an byte stream into an object.

By using readObject() method which is in ObjectInputStream class, we can achieve deserialization.

Constructor of object is never called when an object is deserialized.
*
*
* */



public class Serialization {


        }
