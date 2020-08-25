package com.uiuc.implementations;

import com.uiuc.interfaces.Animal;

public class Cat implements Animal {

    @Override
    public String looks() {
        return "Has Fur.";
    }

    @Override
    public String sounds() {
        return "MEOW!!!";
    }
}
