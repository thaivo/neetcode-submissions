class Solution {
    public boolean isValid(String s) {
        switch(s.length()){
            case 1:
                return false;
            case 2:
                if(s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') return false;
        }
        Deque<Character> stack = new ArrayDeque<>();
        
        for(int i = 0; i < s.length(); i++){
            if(!stack.isEmpty() && 
            ((stack.peek() == '[' && s.charAt(i) == ']') || 
            (stack.peek() == '{' && s.charAt(i) == '}') ||
            (stack.peek() == '(' && s.charAt(i) == ')')))
            {
                stack.pop();
            }
            else
            {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
