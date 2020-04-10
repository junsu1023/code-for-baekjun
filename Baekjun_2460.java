import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_2460 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] total = new int[10];
        int sum = 0;
        for(int i=0; i<10; i++){
            int takeoff = sc.nextInt();
            int ride = sc.nextInt();
            sum -= takeoff;
            sum += ride;
            total[i] = sum;
        }
        Arrays.sort(total);
        System.out.println(total[9]);
    }
}
