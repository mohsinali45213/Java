package Sort;

public class SelectionSort {
  public static void printArr(int arr[]){
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }
  public static void main(String[] args) {
    int arr[] = {8,3,7,5,9,2,5,6,0};   
    for (int i = 0; i < arr.length-1; i++) {
      int smallest = i;
      for (int j = i+1; j < arr.length; j++) {
        if(arr[smallest]>arr[j]){
          smallest=j;
        }
      }
      int temp = arr[smallest];
      arr[smallest] = arr[i];
      arr[i] =temp;
    }
    printArr(arr);
  }
}
