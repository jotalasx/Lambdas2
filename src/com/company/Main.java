package com.company;

import com.company.inter.interClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        final String SEPARATOR = " ";
        final String SILABA = "to";

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
        names.sort(Comparator.naturalOrder());
        System.out.println(names);

        List<String> resultado = new ArrayList<>();

        for (String item: names){
            boolean contains = item.contains(SILABA);
            if(contains){
                resultado.add(item);
            }
        }

        // Esta línea hace lo mismo que el foreach anterior
        List<String> collect = names.stream()
                .filter((n) -> n.contains(SILABA))
                .collect(Collectors.toList());
        // Sacar variable: ctrl+alt+v
        long count = names.stream()
                .filter((n) -> n.contains(SILABA))
                .count();

        // Duplicar línea: ctrl+d
        System.out.println(resultado);
        System.out.println(collect);
        System.out.println(count);

        names.stream()
                .filter((n) -> n.contains(SILABA))
                .forEach(n -> System.out.println(n));






    }
}
