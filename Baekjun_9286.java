import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Baekjun_9286 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int i=0; i<test_case; i++){
            List<Integer> list = new LinkedList<>();
            int n = sc.nextInt();
            for(int j=0; j<n; j++){
                int grade = sc.nextInt();
                if(grade<6) list.add(grade+1);
            }
            System.out.println("Case " + (i+1) + ":");
            for(int j:list) System.out.println(j);
        }
    }
}
