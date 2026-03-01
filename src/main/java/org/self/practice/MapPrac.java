package org.self.practice;

import java.util.HashMap;
import java.util.Map;

class MapPrac{
    public void prac(){
        Map<Integer, String> m= new HashMap<>();

        m.put(1, "hello");
        m.put(2,"Hey");
        m.put(3,"Bye");
        System.out.println(m);

        for(Integer h: m.keySet()){
                    System.out.println(h+" "+m.get(h));

        }
    }
}