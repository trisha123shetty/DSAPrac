import java.util.* ;
import java.io.*; 


public class LeftRotateByOne {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
       int temp=arr[0];
        for(int i=0;i<n;i++){
            if(i==n-1){
                    arr[i]=temp;
            }else{
               int j=i+1;
                arr[i]=arr[j];
            }
        }
        return arr;

    }
}