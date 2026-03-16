package org.self.ArrayDSAQues;


class SecondLargest {
    public int getSecondLargest(int[] arr) {
        // code here
        int high=Integer.MIN_VALUE;
         int secHigh=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>high){
                secHigh=high;
                high=arr[i];
                
            }
             if(arr[i]>secHigh && arr[i]!=high){
                secHigh=arr[i];
            }
        }
        if(secHigh==Integer.MIN_VALUE){
            return -1;
        }
        return secHigh;
    }
}