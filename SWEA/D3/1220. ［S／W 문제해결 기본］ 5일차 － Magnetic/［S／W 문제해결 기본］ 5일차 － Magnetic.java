
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T = 10; 
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			int n = sc.nextInt(); 
            int[][] map = new int[n][n];
            
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    map[i][j] = sc.nextInt(); // 0 : 빈칸 , 1 : N극 (아래로), 2: S극 (위로)
                }
            }
            
           	int count = 0;
            
            // 세로줄 확인
            for (int j = 0; j < n; j++) {
                int prev = 0; //이 줄에서 직전에 본 것 (0이면 아직
                
                for(int i = 0; i < n; i++) {
                    int now = map[i][j]; //지금 칸
                	
                	if (now == 0) continue ; // 빈칸 건너뛰기 
                	
                	if (prev == 1 && now == 2) { // 직전이 1이고 지금이 2면
                       count++; // 더하기 
                    }
                
                	prev = now; // 지금 값을 기억 
                }
            }
        
        	System.out.println("#" + test_case + " " + count);
		}
	}
}