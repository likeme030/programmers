class Solution {
    public int solution(String number) {
     
        int result = 0;
        for(int j = 0; j < number.length(); j++){
            char c = number.charAt(j);
            int d = Character.getNumericValue(c);
            result += d;
        }
        return result % 9; 
    }
}