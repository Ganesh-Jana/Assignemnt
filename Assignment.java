import java.util.*;

class Assignment {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter YOur String: ");
    String str = sc.nextLine();
    int n = str.length();
    Stack<Integer> stack = new Stack<>();
    int maxLen = 0;
    for (int i = 0; i < n; i++) {
      if (str.charAt(i) == '(') {
        stack.push(i);
      } else {
        stack.pop();
        if (stack.isEmpty()) {
          stack.push(i);
        } else {
          maxLen = Math.max(maxLen, i - stack.peek());
        }
      }
    }
    System.out.println("Maximum length of valid parentheses substring: " + maxLen);
  }

}
