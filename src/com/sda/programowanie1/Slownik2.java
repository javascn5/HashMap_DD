package com.sda.programowanie1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Slownik2 {


    private Map<String, List <String>  > dictionary2 = new HashMap<>();

    public void add(String key, List<String> value){
//        for (String key : dictionary.keySet()){
//            if (key.equals(key)){
//                System.out.println("Slowo " + key + " juz istnieje");
//            }
//        }
        if (key.length() == 0 || value.size() == 0){
            System.out.println("zbyt krotko");
            return;
        }

        dictionary2.put (key, value);

    }

    public List <String> getTranslation (String key){
        return dictionary2.get(key);
    }

    public void edit (String key, List <String> value){
        dictionary2.replace(key, value);
    }

    public void remove (String key, List <String> value){
        dictionary2.remove(key,value);
    }

    public void showAll(){
        for (String key : dictionary2.keySet()){
            System.out.println(key + " = " + dictionary2.get(key));
        }
    }

    public List <String> search(String phrase){
        List <String> temp = new ArrayList<String>();
        for (String key : dictionary2.keySet()){
            if (key.contains(phrase)){
                temp.add(key);
            }
        }
        return temp;
    }


}
