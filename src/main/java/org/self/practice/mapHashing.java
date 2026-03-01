package org.self.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class mapHashing{
    public void fun(){
    char arr[]= {'a','a','b','a','b','c'};
    char number;
    Scanner sc = new Scanner(System.in);
    System.out.println("find the  count");
    number=sc.next().charAt(0);
//   Map<Integer, Integer> hash = new HashMap<>();
//    for(int i =0;i<arr.length;i++){
//      if(hash.containsKey(arr[i])){
//         hash.put(arr[i], hash.get(arr[i])+1);
//      }
//      else{
//         hash.put(arr[i],1);
//      }
//    }
//    System.out.println("count is"+ hash.get(number));

Map<Character, Integer> hash = new HashMap<>();
for(int i=0;i<arr.length;i++){
    if(hash.containsKey(arr[i])){
        hash.put(arr[i],hash.get(arr[i])+1);
    }else{
        hash.put(arr[i],1);
    }
}
System.out.println("count is"+ hash.get(number));

    }

}
