package Projects;

public class ReverseString {

  public static void main(String[] args) {
    String str = "abcd";
    char[] charArray = str.toCharArray();
    int left = 0;
    int right = charArray.length - 1;
    while (left < right) {
      char temp = charArray[right];
      charArray[right] = charArray[left];
      charArray[left] = temp;
      left++;
      right--;
    }
    String reverse = new String(charArray);
    System.out.println(reverse);
  }
}