import java.util.*;

public class Main {
    public static void main(String[] args) {
        int cnt = 0;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = n; i < 100; i += n){

                if(i % 5 == 0) {
                    cnt++;
                }
            System.out.print(i + " ");
            
             if(cnt == 2){
                break;
             }
        }
    }
}