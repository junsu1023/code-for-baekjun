import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_13416 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int day = sc.nextInt();
            int[] invest = new int[3];
            int sum = 0;
            for(int i=0; i<day; i++){
                for(int j=0; j<3; j++){
                    invest[j] = sc.nextInt();
                }
                Arrays.sort(invest);
                if(invest[2] > 0) sum += invest[2];
            }
            System.out.println(sum);
        }
    }
}
