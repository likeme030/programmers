
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int k = sc.nextInt(); 
            int n = (int) Math.pow(2, k); // 참가자 수 = 2의 k제곱 
            int[] arr = new int[n]; // 실력 저장할 배열
            
            // 실력 입력받기
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            
            int sum = 0; // 모든 경기의 지루한 정도 종합 
        
          // 최종 승자 1명이 남을 때까지 반복
            while (arr.length > 1) {

                // 다음 라운드 승자들을 저장할 배열
                // 매 라운드마다 참가자 수가 절반으로 줄어듦
                int[] next = new int[arr.length / 2];

                // 두 사람씩 짝지어 경기 진행
                for (int i = 0; i < arr.length; i += 2) {

                    // 두 사람 중 실력이 높은 사람
                    int a = Math.max(arr[i], arr[i + 1]);

                    // 두 사람 중 실력이 낮은 사람
                    int b = Math.min(arr[i], arr[i + 1]);

                    // 두 사람의 실력 차이를 누적
                    sum += a - b;

                    // 승자는 실력이 높은 사람
                    int winner = a;

                    // 승자를 다음 라운드 배열에 저장
                    next[i / 2] = winner;
                }

                // 다음 라운드의 참가자 배열로 변경
                arr = next;
            }

            // 테스트 케이스 번호와 지루한 정도 총합 출력
            System.out.println("#" + test_case + " " + sum);
        }
	}
}