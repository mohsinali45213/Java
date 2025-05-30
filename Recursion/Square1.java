public class Square1 {

  public static int square(int x,int n){
    if(n==0){
      return 1;
    }
    if(x==0){
      return 1;
    }
    return x*square(x,n-1);
  }
  public static void main(String[] args) {
    int n=5;
    int x=2;
    int result = square(x,n);
    System.out.println(result);
  }
}
