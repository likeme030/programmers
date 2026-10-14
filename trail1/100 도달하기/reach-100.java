import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        li.add(1);
        int a = sc.nextInt();
        li.add(a);
        for(int i = 2; i < 100; i++){

            li.add(li.get(i-2)+li.get(i-1));
            if(li.get(i)>100){
                break;
            }
        }

        for(int x : li){
            System.out.print(x + " " );
        }


    }
}