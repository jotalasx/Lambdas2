package com.company.impl;

import com.company.inter.interClass;

public class implClass implements interClass {

    @Override
    public String abstractMeth(String name, String surname) {
        return name + "@" + surname;
    }
}
