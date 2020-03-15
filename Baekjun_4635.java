import java.util.Scanner;

public class Baekjun_4635 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int test_case = sc.nextInt();
            if(test_case == -1) break;
            int[] meter = new int[test_case];
            int[] hour = new int[test_case];
            int sum = 0;
            for(int i=0; i<test_case; i++) {
                meter[i] = sc.nextInt();
                hour[i] = sc.nextInt();
            }
            for(int i=0; i<test_case; i++){
                if(i==0) sum += meter[0] * hour[0];
                else sum += meter[i] * (hour[i] - hour[i-1]);
            }
            System.out.println(sum + " miles");
        }
    }
}
