
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
        String[] words = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
			sc.next();
            int N = sc.nextInt(); 
            
            int[] count = new int[10]; // count[k] = k번 단어가 나온 횟수 
            
            // 단어 읽으면서 개수 세기
            for(int i = 0; i <  N; i++) {
                String s = sc.next();
                for(int k = 0; k < 10; k++) {
                    if( s.equals(words[k])) {
                        count[k]++;
                        break;
                    }
                }
            }

            // 작은 수부터 개수만큼 출력할 문자열 만들기
            StringBuilder sb = new StringBuilder();
            sb.append("#").append(test_case).append("\n");
            for(int k = 0; k < 10; k++) {
                for(int c = 0; c < count[k]; c++){
                    sb.append(words[k]).append(" ");
                }
            }
                              
          	System.out.println(sb);
		}
	}
}