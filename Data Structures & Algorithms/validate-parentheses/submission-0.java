class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(', '[', '{' -> stack.push(s.charAt(i));
                case ')' -> {
                    if (stack.isEmpty() || stack.pop() != '(')
                        return false;
                }
                case ']' -> {
                    if (stack.isEmpty() || stack.pop() != '[')
                        return false;
                }
                case '}' -> {
                    if (stack.isEmpty() || stack.pop() != '{')
                        return false;
                }
            }
        }
        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }
}
