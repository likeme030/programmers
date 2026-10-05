import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> a = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                a.add(arr[i]);
            }
        }
        
        int[] result = new int[a.size()];
        int idx = 0;
        for(int b : a){
            result[idx++] = b;
        }
        
        return result;
    }
}