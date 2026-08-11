class Solution {
    public long solution(int[] num_list) {
        StringBuilder result1 = new StringBuilder();
        StringBuilder result2 = new StringBuilder();
    
    for(int i = 0 ; i<num_list.length; i++){
        if(num_list[i] % 2 == 0){
            result1.append(String.valueOf(num_list[i]));
        }else{
            result2.append(String.valueOf(num_list[i]));
        }
    }  
    
    long oddNum = Long.parseLong(result1.toString());
    long evenNum = Long.parseLong(result2.toString());
        
        return oddNum + evenNum ; 
    }
}