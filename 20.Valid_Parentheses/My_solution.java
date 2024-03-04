
import java.util.Stack;
public class Valid_Parentheses {
	public static void main(String[] args) {		
		 System.out.println(isValid("()"));
	     System.out.println(isValid("()[]{}"));    
	     System.out.println(isValid("(]"));   
	}
	
	public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char bracket : s.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char openBracket = stack.pop();
                if (bracket == ')' && openBracket != '(' ||
                    bracket == ']' && openBracket != '[' ||
                    bracket == '}' && openBracket != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
