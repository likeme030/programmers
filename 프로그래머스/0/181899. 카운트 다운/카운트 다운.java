class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] result = new int[start_num - end_num+1];
        
        int cnt = 0;
        for(int j = 0; j < result.length; j++){
            if(result[j] <= end_num){
                result[j] = start_num - cnt;
                cnt++;
            }
        }
        return result;
    }
}