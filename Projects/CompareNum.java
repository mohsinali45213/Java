package Projects;

import java.util.Scanner;

public class CompareNum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    System.out.println(compare(a, b));
  }

  public static int compare(int a,int b){
    if(a>b){
      return a;
    }else{
      return b;
    }
  }
}
