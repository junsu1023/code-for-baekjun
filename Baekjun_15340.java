import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_15340 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int c = sc.nextInt();
            int d = sc.nextInt();
            if(c==0 && d==0) break;
            int[] m = {30*c+40*d, 35*c+30*d, 40*c+20*d};
            Arrays.sort(m);
            System.out.println(m[0]);
        }
    }
}
