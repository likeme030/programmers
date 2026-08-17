import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = l; i <= r; i++){
            String str = String.valueOf(i);
            boolean isValid = true;
            
            for(int j = 0; j < str.length(); j++){
                char c = str.charAt(j);
                if(c != '0' && c != '5'){
                    isValid = false;
                    break;
                }
            }
            
            if(isValid){
                list.add(i);
            }
        }
        
        int[] answer;
        if(list.isEmpty()){
            answer = new int[]{-1};
        }else{
            answer = new int[list.size()];
            for(int i = 0; i < list.size(); i++){
                answer[i] = list.get(i);
            }        
        }
        return answer;
    }
}