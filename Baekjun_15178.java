import java.util.Scanner;

public class Baekjun_15178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int[] n = new int[3];
        for(int i=0; i<test_case; i++){
            int sum = 0;
            for(int j=0; j<3; j++){
                n[j] = sc.nextInt();
                sum += n[j];
            }
            if(sum != 180) System.out.println(n[0] + " " + n[1] + " " + n[2] + " Check");
            else System.out.println(n[0] + " " + n[1] + " " + n[2] + " Seems OK");
        }
    }
}
