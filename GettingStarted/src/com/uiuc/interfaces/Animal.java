package com.uiuc.interfaces;

//From Java 8 you can define static methods in interfaces in addition to default methods.

//A static method is a method that is associated with the class in which it is defined rather
//than with any object. Every instance of the class shares its static methods.
//This makes it easier for you to organize helper methods in your libraries;
//you can keep static methods specific to an interface in the same interface rather than in a separate class.

public interface Animal {

    //abstract methods

    String looks();
    String sounds();

}
