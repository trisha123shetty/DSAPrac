
class quickSort{
int func(int arr[],int low, int high){
  int  i=low;
  int  j=high;
  int pivot=arr[low];
  while(i<j){

    while(arr[i]<=pivot && i<high-1){
        i++;
    }
    while(arr[j]>pivot && j>=low+1){
        j++;
    }
    if(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
  }
  int temp=arr[pivot];
        arr[pivot]=arr[j];
        arr[j]=temp;
  
return j;

}

public void sorting(int arr[],int low,int high){
    
    if(low<high){
        int pivotIndex=func(arr, low, high);
        sorting(arr,low,pivotIndex-1);
        sorting(arr, pivotIndex+1, high);
    }
}
}