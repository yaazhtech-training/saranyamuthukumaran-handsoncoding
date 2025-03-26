package com.example.handsonsaranyaMuthukumaran.javaeightfeatures;
/*why we go for java 8 ?
* List out all java 8
* lambda,functional interface,streams,parallel streams,optional classes,default methods
*🔹 1. Functional Interface
Definition:
A Functional Interface is an interface that has only one abstract method but can have multiple default and static methods. It is used for Lambda expressions.
*@FunctionalInterface
interface Calculator {
    int add(int a, int b); // Only one abstract method
}
*
* */

public interface FunctionalInterface {
    int add(int a, int b); // Only one abstract method
}
