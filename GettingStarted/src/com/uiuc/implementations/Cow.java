package com.uiuc.implementations;

import com.uiuc.interfaces.Animal;

public class Cow implements Animal {

    @Override
    public String looks() {
        return "Huge Shape.";
    }

    @Override
    public String sounds() {
        return "MOO!!!";
    }
}
