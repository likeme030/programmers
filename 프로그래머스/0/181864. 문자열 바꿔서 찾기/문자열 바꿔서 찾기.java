class Solution {
    public int solution(String myString, String pat) {
        StringBuilder s = new StringBuilder();
        
        for(int i = 0; i < myString.length(); i++){
            char c = myString.charAt(i);
            if(c == 'B'){
                s.append('A');
            }else{
                s.append('B');
            }
        }
               
        if(s.toString().contains(pat)){
            return 1;
        }else{
            return 0;
        }
        
    }
}