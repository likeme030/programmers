/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        // 이동거리 계산하기
        // 0 : 현재 속도 유지 1: 가속 2: 감속
        for(int t = 1; t <= T; t++ ) {
            // n개의 커맨드를 모두 수행했을 때 n 초 동안 이동한 거리 계산
            // 처음은 시간 , 두번 째는 속도 
            int n = sc.nextInt();

            int speed = 0; // 현재 속도
            int distance = 0; // 누적 이동거리

            for(int i = 0; i <n; i++){
                
                int g = 0;
                int command = sc.nextInt();

                if(command != 0) {
                    g = sc.nextInt();
                }

                if(command == 1) {
                    //속도 증가
                    speed += g;
                } else if( command == 2) {
                    speed -= g;
                }

                if(speed < 0){
                    speed = 0;
                }

                 distance += speed; // 매초 이동거리 누적

                }

            System.out.println("#" + t + " " + distance);
        }

    }
}