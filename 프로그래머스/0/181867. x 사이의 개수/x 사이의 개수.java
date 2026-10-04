import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String myString) {
        List<Integer> li = new ArrayList<>();
        int cnt = 0;
        for(int i = 0; i < myString.length(); i++){
            
            if(myString.charAt(i) != 'x'){
                cnt++;
            }else if( myString.charAt(i) == 'x'){
                li.add(cnt);
                  cnt = 0;  // x를 만났을 때만 초기화
            }
          
        } 
        li.add(cnt);      // 마지막 x 뒤의 구간
        
        int[] result = new int[li.size()];
        int idx = 0;
        for(int x : li){
            result[idx++] += x;
        }
        return result;
    }
}