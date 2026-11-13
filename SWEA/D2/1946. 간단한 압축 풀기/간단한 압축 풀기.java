
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 전체 테스트 케이스 수 
	
		for(int t = 1; t <= T; t++) {
			int count = 0;
			int n = sc.nextInt(); // 각 테스트 케이스마다 주어지는 문자 쌍의 개수 
			System.out.println("#" + t);
		
			for(int i = 0; i < n; i++) {

				String s = sc.next();
				int k = sc.nextInt();
				
				for(int j = 0; j < k; j++) {
					System.out.print(s);
					count++;
					
					if(count % 10 == 0) { // 출력 중 10글자마다 줄바꿈
						System.out.println();
					}
				}
			}
			
		     if (count % 10 != 0) { 
		    	 // 총 출력 글자 수가 10의 배수가 아니면 마지막 줄에서는 자동으로 줄바꿈되지 않기 때문에
		    	 // 테스트 케이스가 끝났을 때 남은 글자가 있으면 줄바꿈
	                System.out.println();
	            }
		    }    
	}
}