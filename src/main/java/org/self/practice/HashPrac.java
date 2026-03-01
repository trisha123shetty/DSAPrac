package org.self.practice;

import java.util.Scanner;

class HashPrac{
    public void CountNumber(){
        Scanner sc = new Scanner(System.in);
    int arr[]= new int[5];
    System.out.println("enter the values into an error");
for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
}
int number=0;
System.out.println("enter th number for which u have to take the count");
number=sc.nextInt();
 int[] hash = new int[13];   // all values are 0 by default
 for(int i=0;i<arr.length;i++){
  hash[arr[i]]++;
 }
System.out.println("countt is"+hash[number]);

    }

}