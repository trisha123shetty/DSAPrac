package org.self.Sorting;

class RecursiveBubbleSort{
//Brute force

// void bubbleSortRec(int arr[], int n){
//         if(n==1)
//             return;
//         for(int j=0;j<n-1;j++){
//             if(arr[j+1]<arr[j]){
//                 int temp=arr[j+1];
//                 arr[j+1]=arr[j];
//                 arr[j]=temp;
//             }
//         }
//                bubbleSortRec(arr,n-1);
//     }
//Optimized
 void bubbleSortRec(int arr[], int n){
        if(n==1)
            return;
        boolean swap=false;
        for(int j=0;j<n-1;j++){
            if(arr[j+1]<arr[j]){
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
                swap=true;
            }
        }
        if(swap==false)
            return;
        bubbleSortRec(arr,n-1);
    }
    public void bubbleSort(int[] arr) {
        // code here
        int n=arr.length;
        
        bubbleSortRec(arr,n);
    }
}