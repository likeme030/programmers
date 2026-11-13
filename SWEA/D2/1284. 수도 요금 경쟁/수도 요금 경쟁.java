
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			
			int P = sc.nextInt(); // A사 1리터
			int Q = sc.nextInt(); // B사 기본요금
			int R = sc.nextInt(); // B사 기본요금 마지노선 리터 
			int S = sc.nextInt(); // B사 추가 1리터 
			int W = sc.nextInt(); // 1달 사용량 
			
			// A사: 사용량 * 리터당 요금 -> 사용량에 비례함 
			int costA = P * W;
			
			// B사: 기본 제공량 R 초과 여부에 따라 요금이 달라지므로 삼항 연산자 사용 
			int costB = (W <= R) ? Q : Q + (W - R) * S;
			// 사용량 W가 R(기본요금 마지노선 리터) 이하라면 기본요금 Q를 저장하고 
			// 그렇지 않으면 기본요금 Q에 초과요금을 더한 값을 B에 저장한다.
			
			// 두 회사 중 더 저렴한 요금 선택
			int result = Math.min(costA,  costB);
			
			System.out.println("#" + t + " " + result);

		}
		
	}
}