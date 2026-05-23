

class Solution {
    public int solution(int a, int b, int c, int d) {
      
        int[] counts = new int[7];
        counts[a]++;
        counts[b]++;
        counts[c]++;
        counts[d]++;
        
        int p2 = 0;
        int q2 = 0;

       
        for (int i = 1; i <= 6; i++) {
            
          
            if (counts[i] == 4) {
                return 1111 * i;
            } 
            
           
            else if (counts[i] == 3) {
                int p = i; 
                int q = 0; 
                for (int j = 1; j <= 6; j++) {
                    if (counts[j] == 1) {
                        q = j;
                        break;
                    }
                }
                return (10 * p + q) * (10 * p + q);
            } 
            
         
            else if (counts[i] == 2) {
                if (p2 == 0) {
                    p2 = i;
                } else {
                    q2 = i;
                }
            }
        }
      
        if (p2 != 0 && q2 != 0) {
            return (p2 + q2) * Math.abs(p2 - q2);
        }
      
        if (p2 != 0 && q2 == 0) {
            int q = 0;
            int r = 0;
           
            for (int i = 1; i <= 6; i++) {
                if (counts[i] == 1) {
                    if (q == 0) q = i;
                    else r = i;
                }
            }
            return q * r;
        }

        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 1) {
                return i;
            }
        }

        return 0;
    }
}