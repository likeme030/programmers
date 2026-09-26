class Solution {
    public int solution(String myString, String pat) {
        String myStringLower = myString.toLowerCase();
        String patLower = pat.toLowerCase();
        
        if(myStringLower.contains(patLower)){
            return 1;
        }else {
            return 0;
        }
        
        
    }
}