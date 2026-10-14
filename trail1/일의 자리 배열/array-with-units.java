import java.util.*; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int f = sc.nextInt();
        int s = sc.nextInt();

        int[] a = new int[10];
        a[0] = f;
        a[1] = s;

    
        for(int i = 2; i < 10; i++){
            a[i] = (a[i-1] + a[i-2] ) % 10;
        }
        
        for(int i = 0; i < 10; i++){
            System.out.print(a[i] + " ");
        }


        
    }
}