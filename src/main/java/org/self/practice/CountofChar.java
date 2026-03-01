package org.self.practice;

import java.util.Scanner;

class CountofChar{
    public void countChar(){
// char arr[] = new char[5];
// System.out.println("Enter values into an array");
// Scanner sc = new Scanner(System.in);
// for (int i = 0; i < arr.length; i++) {
//     arr[i]=sc.next().charAt(0);
// }
// char key;
// System.out.println("Enter the char to count");
// key=sc.next().charAt(0);
// int hash[]=new int[26];
// int remider=0;
// char a='a';
// for(int i=0;i<arr.length;i++){
   
//     hash[arr[i]-a]++;
  
// }
// System.out.println("count is"+hash[key-a]);

String s;
Scanner sc = new Scanner(System.in);
System.err.println("Eneter tthe string");
s=sc.next();
char key;
System.out.println("Enter the elecmen or which  have o ount");
key=sc.next().charAt(0);
int hash[]= new int[256];
for(int i=0;i<s.length();i++){
    hash[s.charAt(i)]++;
}

System.out.println("count is"+hash[key]);


    }

}