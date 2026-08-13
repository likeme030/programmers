class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length ; i ++){
	        int idx1 = queries[i][0];
            int idx2 = queries[i][1];
            int a = 0;
            a = arr[idx1];
            arr[idx1] = arr[idx2];
            arr[idx2] = a;
    }

    return arr;
 
    }
}