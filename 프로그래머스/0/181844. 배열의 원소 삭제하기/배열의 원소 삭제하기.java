import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> li = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            boolean found = false;
            for(int j = 0; j < delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    found = true; 
                    break;
                }
            }
            if(!found){
                li.add(arr[i]);
            }
        }
        
        int[] result = new int[li.size()];
        int idx = 0;
        for(int x : li){
            result[idx++] = x;
        }
        
        return result;
    }
}