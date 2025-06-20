import java.util.Scanner;;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int next = 1, a = 0, b = 1;
        for (int i = 1; i <= num; i++) {
            System.out.print(next + " ");
            next = a + b;
            a = b;
            b = next;
        }
    }
}
