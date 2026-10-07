import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        Stack<Integer> stk = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            int a = arr[i];
            
            if(stk.isEmpty()){
                stk.push(a);
            }else if(!stk.isEmpty() && stk.peek() == arr[i]){
                stk.pop();
            }else if(!stk.isEmpty() && stk.peek() != arr[i]){
                stk.push(a);
            }
        }
        
        if(stk.isEmpty()){
            stk.push(-1);
        }
        
        int[] result = new int[stk.size()];
        int idx = 0;
        for(int x : stk){
            result[idx++] = x;
        }
        
        return result;
    }
}