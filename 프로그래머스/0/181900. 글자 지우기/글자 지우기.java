class Solution {
    public String solution(String my_string, int[] indices) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++){
            boolean r = false;
            
            for(int j = 0; j < indices.length; j++){
                if(i == indices[j]){
                    r = true;
                }
             
            }
              if(r != true){
                    sb.append(my_string.charAt(i));
                }
        }
        return sb.toString();
        
    }
}