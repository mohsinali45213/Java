package Sort;

public class BubbleSort {

  public static void printArr(int arr[]){
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }
  public static void main(String[] args) {
    int arr[] = {8,3,7,5,9,2,5,6,0};    
    for (int i = 0; i < arr.length-1; i++) {
      for (int j = 0; j < arr.length-1-i; j++) {
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j]=arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    printArr(arr);
  }
}
