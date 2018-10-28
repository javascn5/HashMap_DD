package com.sda.programowanie1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

    Slownik addToDictionary = new Slownik();

        addToDictionary.add("kot", "cat");
        addToDictionary.add("pies", "dogg");
        addToDictionary.add("pilka", "ball");

        //System.out.println(addToDictionary.getAllPl());


        //addToDictionary.showAll();

        Slownik2 slownik2 = new Slownik2();

        slownik2.add("pies", Arrays.asList("dog", "sobaka"));
        System.out.println(slownik2.getTranslation("pies"));

        slownik2.edit("pies", Arrays.asList("kot", "slon", "zabka"));

        System.out.println(slownik2.getTranslation("pies"));

        slownik2.showAll();

        System.out.println(slownik2.search("i"));
    }
}
