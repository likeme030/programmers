class Solution {
    public String solution(String my_string, int[][] queries) {
        
        char[] arr = my_string.toCharArray(); // String을 통째로 char 배열로 바꿀 수 있는 함수라네요 외워야지 .. 
        
        for(int i = 0; i < queries.length; i++){
                int left = queries[i][0];
                int right = queries[i][1];
            
            while(left < right){
                char t = arr[left];
                arr[left] = arr[right];
                arr[right] = t;
                left++;
                right--;
            }
        }  
        return new String(arr); // char[] → String 하는 방법이래요
    }
}