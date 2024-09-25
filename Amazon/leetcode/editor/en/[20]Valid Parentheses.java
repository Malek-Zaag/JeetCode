import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<>();
        int n = s.length();
        try {
            for (int i = 0; i < n; i++) {
                switch (s.charAt(i)) {
                    case '{':
                    case '[':
                    case '(':
                        parentheses.push(s.charAt(i));
                        break;
                    case '}':
                        if (parentheses.pop() != '{') {
                            return false;
                        }
                        break;
                    case ']':
                        if (parentheses.pop() != '[') {
                            return false;
                        }
                        break;

                    case ')':
                        if (parentheses.pop() != '(') {
                            return false;
                        }
                        break;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return parentheses.isEmpty();
    }
}

