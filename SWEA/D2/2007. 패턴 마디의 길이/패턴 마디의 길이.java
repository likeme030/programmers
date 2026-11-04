
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			String s = sc.next();
			int answer = 0; // 마디 길이를 담을 변수
			
			//마디 길이 후보를 1부터 10까지 작은 것부터 확인
			for(int len = 1; len <= 10; len++) {
				boolean ok = true;
				
				//문자열 전체를 한 글자씩 확인
				for(int i = 0; i < s.length(); i++){
					// i % len = i번째 글자가 마디 안에서 몇 번째 자리인지 
					// ex) len=5일 때 i=7 -> 2번 자리, i = 10 -> 0번 자리
					// i번째 글자와 마디의 같은 자리 글자가 다르면 이 len은 마디가 아님 
					if(s.charAt(i) != s.charAt(i % len)) {
						ok = false; // 가정 실패
						break; // 더 볼 필요 없으니 중단
					}
				}
				
				// 끝까지 다른 글자가 하나도 없었으면 이 len이 마디 길이 
				if(ok) {
					answer = len;
					break; // 작은 것부터 봤으니 처음 통과한 값이 답 -> 중단 
				}
			}
			
			System.out.println("#" + test_case + " " + answer);
		}
	}
}