class Solution {
    public int solution(int a, int b) {
        
        
        String c = String.valueOf(a)+String.valueOf(b);
        String d = String.valueOf(b)+String.valueOf(a);
        
        int num1 = Integer.parseInt(c);
        int num2 = Integer.parseInt(d);
        
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }
}