import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_3047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[3];
        for(int i=0; i<3; i++) n[i] = sc.nextInt();
        sc.nextLine();
        String alpha = sc.nextLine();
        Arrays.sort(n);
        for(int i=0; i<3; i++){
            if(alpha.charAt(i)=='A') System.out.print(n[0] + " ");
            else if(alpha.charAt(i)=='B') System.out.print(n[1] + " ");
            else if(alpha.charAt(i)=='C') System.out.print(n[2] + " ");
        }
    }
}
