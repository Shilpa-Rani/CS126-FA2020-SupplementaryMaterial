package com.uiuc.implementations;

import com.uiuc.interfaces.Animal;

public class Dog implements Animal {

    @Override
    public String looks() {
        return "Looks Cute.";
    }

    @Override
    public String sounds() {
        return "BARK!!!";
    }
}
