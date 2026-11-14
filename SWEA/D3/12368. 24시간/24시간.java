
import java.util.*;
import java.io.*;

class Solution
{
	 public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); 

        for(int t = 1; t <= T; t++) {

            int A = sc.nextInt(); //현재 시각
            int B = sc.nextInt(); // 미래 시간

            // 현재 시각 + 흐른 시간을 24로 나눈 나머지
            int result = (A + B) % 24;

            System.out.println("#" + t + " " + result);
        }
    }
}