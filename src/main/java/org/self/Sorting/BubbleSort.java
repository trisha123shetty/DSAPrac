package org.self.Sorting;
class BubbleSort {
    //worst case
    public void bubbleSort(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
//Best case if all array is already sorted
    public void bubbleSort2(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=n-1;i>0;i--){
            
            boolean swap=false;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }
    }

}