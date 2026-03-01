package org.self.practice;
import java.util.LinkedList;

class LinkedListprac{
    public void prac(){
        LinkedList<String> ll = new LinkedList<>();
        ll.add("geeks");
        ll.add("for");
        ll.add("Geeks");
        System.out.println(ll);
        ll.remove("for");
        ll.set(1,"learn");
        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }

    }
}