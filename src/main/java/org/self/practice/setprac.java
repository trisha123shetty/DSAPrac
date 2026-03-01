package org.self.practice;

import java.util.HashSet;
import java.util.Set;

class setprac{
    public void prac(){
        Set<String> s = new HashSet<>();
        s.add("Trisha");
        s.add("yash");

        System.out.println(s);
        System.out.println("does s coains yash" +s.contains("yash"));
        s.remove("yash");
        for(String h : s){
            System.out.println(h);
        }

    }
}