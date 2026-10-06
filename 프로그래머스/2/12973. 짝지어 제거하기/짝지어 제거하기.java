import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

class Solution
{
    public int solution(String s)
    {
        List<String> li = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        int result = 0;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (stack.isEmpty() || stack.peek() != c) {
            stack.push(c);
            } else if(stack.peek().equals(c)) {
                stack.pop();
            }
        }
        
        if(stack.isEmpty()){
           return result = 1;
        }else{
           return result = 0;
        }

    }
}