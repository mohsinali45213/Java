import java.util.Scanner;
public class Read1DArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = scanner.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter " + size + " elements:");
    for (int i = 0; i < size; i++) {
      arr[i] = scanner.nextInt();
    }
    System.out.println("The elements in the array are:");
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
    scanner.close();
  }
}
