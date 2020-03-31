import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_16546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int out = 0;
        int[] run = new int[n];
        for(int i=0; i<n-1; i++) run[i] = sc.nextInt();
        Arrays.sort(run);
        boolean check = false;
        for(int i=0; i<n-1; i++){
            if(run[i]+1 == run[i+1]) check = true;
            else{
                check = false;
                out = run[i]+1;
                break;
            }
        }
        if(check) System.out.println(n);
        else System.out.println(out);
    }
}
