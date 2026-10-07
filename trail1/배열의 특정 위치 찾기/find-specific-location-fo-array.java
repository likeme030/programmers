import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[11];
        int sum = 0;
        int avg = 0;
        int cnt = 0;
        for(int i = 1; i <= 10; i++){
            a[i] = sc.nextInt();
            if(i%2==0){
                sum += a[i];
            }
            if(i%3==0){
                avg += a[i];
                cnt++;
            }
        }

        double result = (double) avg / cnt;

        System.out.printf("%d %.1f", sum, result);

    }
}