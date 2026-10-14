import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] result = new int[N];
            
        for(int i = 0; i < N; i++) {
            
            int a = sc.nextInt();
            a = a*a;
            result[i] = a;
            System.out.print(result[i] + " ");
        }



    }
}