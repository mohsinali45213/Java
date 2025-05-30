public class ReverseStr {
  public static void reverse(String str,int index){
    if(index==0){
      System.out.println(str.charAt(index));
      return;
    }
    System.out.print(str.charAt(index));
    reverse(str, index-1);
  }
  public static void main(String[] args) {
    String str = "abcd";
    System.out.println(str);
    reverse(str, str.length()-1);
  }
}
