class Solution {
    public boolean isValid(String s) {
        char cc;
        char[] array = s.toCharArray();
        char[] stack = new char[array.length];
        short stackIndex = -1;
        for (char c: array) {
            if(c == '(' || c == '{' || c == '[') {
                stack[++stackIndex] = c;
            } else {
                if(stackIndex < 0) {
                    return false;
                }
                cc = stack[stackIndex--];
                if(!(c == ')' && cc == '(' || c == ']' && cc == '[' || c == '}' && cc == '{')) {
                    return false;
                }
            }
        }

        return stackIndex < 0;
    }
}
