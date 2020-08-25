package com.uiuc;

import com.uiuc.interfaces.Animal;
import com.uiuc.implementations.Dog;
import com.uiuc.implementations.Cat;

public class Main {

    public static void main(String[] args) {

        //Here, tommy is a reference to a real world entity of a Dog class type.
        //Consider it as "new Dog()" refers to a dog being born.
        //And, on the LHS, the owner decides to refer this "Animal" by the name tommy.
        //Note - you cannot have an object of Animal type - since it's an abstract classification concept.
        //& we need sometime of a concrete type to create objects.
        Animal tommy = new Dog();
        System.out.println("Tommy's Sound : "+ tommy.sounds());

        Animal kitty = new Cat();
        System.out.println("Kitty's Looks : "+ kitty.looks());

    }
}
