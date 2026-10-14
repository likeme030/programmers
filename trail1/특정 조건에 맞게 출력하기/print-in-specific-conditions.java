import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 100; i++){
            int a = sc.nextInt();
            if(a%2 == 0){
                 a /= 2;
            }else{
                a += 3;
            }
            if(a == 0){
                break;
            }
            li.add(a);
        }
        for(int x : li){
           System.out.print(x + " ");
            
        }


    }
}