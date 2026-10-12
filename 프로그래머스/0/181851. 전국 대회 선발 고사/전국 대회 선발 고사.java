import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int n = rank.length;
        int[] who = new int[n+1];
        for(int i = 0 ; i< n ; i++){
            who[rank[i]] = i;
        }
        
        int[] result = new int[3];
        int idx = 0;
        for(int r = 1; r <= n && idx < 3; r++){
            int student = who[r];
            if (attendance[student]){
                result[idx++] = student; 
            }
        }
        
        return result[0] * 10000 + result[1] * 100 + result[2];
    }
}