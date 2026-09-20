import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> li = new ArrayList<>();
        
        for (int i = 1; i <= n; i++ ){
            if (i % k == 0){
                li.add(i);
            }
        }
        
        int[] answer = new int[li.size()];
        for (int idx = 0; idx < li.size(); idx++){
            answer[idx] = li.get(idx);
            
        }
        
        return answer;
    }
}