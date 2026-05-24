

class Solution {
    public String solution(String my_string, int[] index_list) {
        
        StringBuilder sb = new StringBuilder();
        
        for (int idx : index_list) {
            
           char ch = my_string.charAt(idx); 
            
            sb.append(ch);
        }
        
        return sb.toString();
    }
}