import java.util.Scanner;

public class Baekjun_3058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int[][] input = new int[test_case][7];
        for(int tc=0; tc<test_case; tc++){
            int sum = 0;
            int min = 101;
            for(int i=0; i<7; i++){
                input[tc][i] = sc.nextInt();
                if(input[tc][i] % 2 == 0){
                    sum += input[tc][i];
                    if(input[tc][i] < min) min = input[tc][i];
                }
            }
            System.out.println(sum + " " + min);
        }
    }
}
