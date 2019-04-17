package com.company;

import com.company.inter.interClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        final String SEPARATOR = " ";

        interClass inter = (n,a) -> (n + "@" + a);
        System.out.println(inter.abstractMeth("Jose María", "Ares"));

        inter = (n,a) -> {

            StringBuilder fullName = new StringBuilder();
            fullName.append(n).append(SEPARATOR).append(a);
            return fullName.toString();
        };

        System.out.println(inter.abstractMeth("Paco", "González"));


        List<String> names = new ArrayList<>();
        names.add("Antonio");
        names.add("Nestor");
        names.add("Tomás");
        names.add("Tamara");
        names.add("María");
        names.add("Chema");

        System.out.println(names.contains("ma"));
        System.out.println(names.contains("Chema"));





    }
}
