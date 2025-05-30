import java.util.Scanner;

public class SwapNumSc
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X");
		int x = sc.nextInt();
		System.out.println("Enter Y");
		int y = sc.nextInt();
		
		System.out.println("Before = " + x +" "+ y);
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("After = " + x +" "+ y);
	}
}