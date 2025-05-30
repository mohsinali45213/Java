public class RemoveDuplicate {

  public static boolean[] map = new boolean[26];

  public static void remove(String str,int idx,String newString){
    if (idx == str.length()) {
      System.out.println(newString);
      return;
    }
    
    char current  = str.charAt(idx);
    if (map[current - 'a']) {
      remove(str, idx+1, newString);
    }else{
      newString += current;
      map[current -'a'] =true;
      remove(str, idx+1, newString);
    }
  }
  public static void main(String[] args) {
    String str = "abccdeeef";
    remove(str,0,"");
  }
}
