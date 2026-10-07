import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for(int i = 0; i < 10; i++){
            a[i] = sc.nextInt();
        }
        int result = 0;
        for(int i = 1; i <= 10; i++){
            if(a[i] % 3 == 0){
                result += a[i-1];
                break;
            }
        }
        System.out.println(result);

    }
}