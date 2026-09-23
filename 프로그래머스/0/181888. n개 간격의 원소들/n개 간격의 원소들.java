import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
    
    List<Integer> li = new ArrayList<>();
    for(int i = 0; i < num_list.length; i += n){
        li.add(num_list[i]);
    }
    int idx = 0;
    int[] result = new int[li.size()]; 
    for(int a : li){
        result[idx++] = a;
    }
    
    return result;
    }
}