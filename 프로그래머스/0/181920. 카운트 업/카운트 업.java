class Solution {
    public int[] solution(int start_num, int end_num) {
        int a = (end_num-start_num)+1;
        int[] result = new int[a];

        for(int i = 0; i< a; i++){
            result[i] = start_num + i;
        }
           return result;
    }
}