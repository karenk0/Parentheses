import java.util.Stack;
public class Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        boolean bool = false;
        for (char c: s.toCharArray()){
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }
            else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
            else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        String s = "as(d{ds}asd[dsd]sd1) ";
        System.out.println(isValid(s));
    }
}
