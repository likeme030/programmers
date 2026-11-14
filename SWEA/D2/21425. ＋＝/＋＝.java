
import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String[] args) throws IOException {
        
        // 테스크 케이스가 60만 개 이상이니까
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 출력 결과를 한 번에 모아서 출력
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            long x = Long.parseLong(st.nextToken()); //  초기 x값
            long y = Long.parseLong(st.nextToken()); // 초기 y값
            long N = Long.parseLong(st.nextToken()); // 목표값

            int count = 0; // 연산 횟수

            //x와 y가 모두 N 이하인 동안 반복
            while (x <= N && y <= N) {
                if( x < y) {
                    // x가 더 작으면 x에 y를 더함
                    x += y;
                } else {
                    //y가 더 작거나 같으면 y에 x를 더함
                    y += x;
                }

                count++; // 연산을 한 번 수행했으므로 1 증가
            }

            // 연산 횟수 출력 형식에 맞게 저장
            sb.append(count).append('\n');
        }
        System.out.print(sb);
    }
}