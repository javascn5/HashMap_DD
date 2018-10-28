package com.sda.programowanie1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Slownik {

   private Map <String, String> dictionary = new HashMap<String, String>();


    public void add(String key, String value){
//        for (String key : dictionary.keySet()){
//            if (key.equals(key)){
//                System.out.println("Slowo " + key + " juz istnieje");
//            }
//        }
        if (key.length() == 0 || value.length() == 0){
            System.out.println("zbyt krotko");
            return;
        }

        dictionary.put (key, value);

    }

    public String getTranslation (String key){
        return dictionary.get(key);
    }

    public void edit (String key, String value){
        if (dictionary.containsKey(key)){
        dictionary.put (key, value );
        }
    }

    public void remove (String key, String value){
        if (dictionary.containsKey(key)){
            dictionary.remove(key);
        }
    }


    public List<String> getAllPl(){

        return new ArrayList<>(dictionary.keySet());

    }

    public void showAll(){
        for (String key : dictionary.keySet()){
            System.out.println(key + " = " + dictionary.get(key));
        }
    }








}
