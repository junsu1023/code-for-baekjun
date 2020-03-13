import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_2959 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] length = new int[4];
        for(int i=0; i<4; i++) length[i] = sc.nextInt();
        Arrays.sort(length);
        System.out.println(length[0] * length[2]);
    }
}
