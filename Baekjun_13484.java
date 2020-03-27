import java.util.Scanner;

public class Baekjun_13484 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        int test_case = sc.nextInt();
        int[] use = new int[test_case];
        int sum = 0;
        for(int i=0; i<test_case; i++){
            use[i] = sc.nextInt();
            sum += basic - use[i];
        }
        sum += basic;
        System.out.println(sum);
    }
}
