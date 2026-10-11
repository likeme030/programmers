class Solution {
    public int solution(String[] strArr) {
        int[] a = new int[31];
        int max = 0;
        for(int i = 0; i < strArr.length; i++){
            a[strArr[i].length()]++;
        }
        
        for(int i = 0;i < a.length; i++){
            if(a[i]> max){
                max = a[i];
            }
        }
        return max;
        }
}