public class Subseq {

  public static void subsequence(String str, int idx , String newString){
    if(idx == str.length()){
      System.out.println(newString);
      return;
    }
    char current = str.charAt(idx);
    subsequence(str, idx+1, newString+current);
    subsequence(str, idx+1, newString);
  }
  public static void main(String[] args) {
    String str = "abc";
    subsequence(str,0,"");
  }
}
