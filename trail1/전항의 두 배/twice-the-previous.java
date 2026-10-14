import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int f = sc.nextInt();
        int s = sc.nextInt();
        a[0] = f;
        a[1] = s;
        System.out.print(a[0]+ " " + a[1] + " " );

        for(int i = 2; i < 10; i++){
            a[i] = a[i-1] + 2*a[i-2];     
            System.out.print(a[i] + " ");
        }

    }
}