import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int sum1 = 0;
        int sum2 = 0;
        int result = 0;
        for(int i = 0; i < 10; i++){
             a[i] = sc.nextInt();
             if(i % 2 == 0){
                sum1 += a[i];
             }else{
                sum2 += a[i];
             }
        }
        if(sum1>sum2){
            result = sum1-sum2;
        } else {
            result = sum2-sum1;
        }
        System.out.print(result);

    }
}