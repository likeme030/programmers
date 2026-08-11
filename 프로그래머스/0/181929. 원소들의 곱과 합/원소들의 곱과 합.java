class Solution {
    public int solution(int[] num_list) {
        
        int sum = 0;
        int gum = 1;

        for(int i = 1 ; i<= num_list.length; i++){
            sum += num_list[i-1];
            gum *= num_list[i-1];
        } 
        if(gum<sum*sum){
            return 1;
        }else{
            return 0;
        }

        
        
    }
}