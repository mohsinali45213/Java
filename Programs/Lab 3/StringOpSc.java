import java.util.Scanner;

public class StringOpSc
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		System.out.println("Upper = "+s.toUpperCase());
		System.out.println("Lower = "+s.toLowerCase());
		System.out.println("Length = "+s.length());
	}
}