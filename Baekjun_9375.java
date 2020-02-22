import java.util.HashMap;
import java.util.Scanner;

public class Baekjun_9375 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            HashMap<String, Integer> map = new HashMap<>();
            int num = sc.nextInt();
            for(int i=0; i<num; i++){
                String cloth = sc.next();
                String kind = sc.next();
                if(map.containsKey(kind)) map.put(kind, map.get(kind) + 1);
                else map.put(kind, 1);
            }
            int result = 1;
            for(int x : map.values()) result *= x+1;
            System.out.println(result -1);
        }
    }
}
