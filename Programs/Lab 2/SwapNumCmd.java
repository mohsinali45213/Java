public class SwapNumCmd {
	public static void main(String args[]) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		System.out.println("Before =" + x + " " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After = " + x + " " + y);
	}
}