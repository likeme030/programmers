
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int t = 1; t <= T; t++) {
            
            int[] arr = new int[4];

            for(int i = 0; i < 4; i++) {
                arr[i] = sc.nextInt();
            }

            int h = arr[0] + arr[2];
            int m = arr[1] + arr[3];

            if(m > 59) {
                h += 1;
                m = m % 60;
            }

            if(h > 12) {
                h -= 12;
            }

            System.out.println("#"+ t + " " + h + " " + m);

        }
    }

}