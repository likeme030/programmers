class Solution {
    public String solution(int[] numLog) {
        
        String[] b = new String[numLog.length-1];

        
        for(int i = 1 ; i < numLog.length ; i++){
        int a = numLog[i] - numLog[i-1];
        
            if(a == 1){
                b[i-1] = "w";
            }else if( a == -1){
                b[i-1] = "s";
            }else if( a == 10){
                b[i-1] = "d";
            }else if( a == -10){
                b[i-1] = "a";
            }
        } 
        
        StringBuilder sb = new StringBuilder();
        for(String s : b ) {
            sb.append(s);
        }
        
        return sb.toString();
    }
}