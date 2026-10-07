import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int result = 0;

        for(int i = 0; i < 100; i++){
            a[i] = sc.nextInt();

            if(a[i] == 0){
                result = a[i-1]+a[i-2]+a[i-3];
                break;
            }
        }

        System.out.println(result);


    }
}