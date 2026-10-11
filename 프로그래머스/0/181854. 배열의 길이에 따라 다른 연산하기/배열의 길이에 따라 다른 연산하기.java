class Solution {
    public int[] solution(int[] arr, int n) {
        for(int i = 0; i < arr.length; i++){
            if(arr.length % 2 == 0){
                if(i % 2 != 0){        // 길이 짝수 → 홀수 인덱스
                    arr[i] += n;
                }
            }else{
                if(i % 2 == 0){        // 길이 홀수 → 짝수 인덱스
                    arr[i] += n;
                }
            }
        }
        return arr;
    }
}