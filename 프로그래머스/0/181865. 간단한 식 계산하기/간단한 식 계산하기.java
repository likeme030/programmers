class Solution {
    public int solution(String binomial) {
        String[] ab = binomial.split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[2]);
        
        if(ab[1].equals("+")){
            return a + b ;
        }else if(ab[1].equals("-")){
            return a - b;
        }else{
            return a * b;
        }

    }
}