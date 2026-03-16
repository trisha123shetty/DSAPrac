package org.self.Sorting;
class RecursiveInsertionSort {
    // Please change the array in-place
    
    void insertSortRec(int arr[], int i, int n){
        if(i==n)
           return;
        int j=i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
        }
        insertSortRec(arr,i+1,n);
    }
    public void insertionSort(int arr[]) {
        
        int n=arr.length;
        insertSortRec(arr,0,n);
    }
}