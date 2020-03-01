import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] hamburger = new int[3];
        int[] juice = new int[2];
        for(int i=0; i<3; i++) hamburger[i] = sc.nextInt();
        for(int i=0; i<2; i++) juice[i] = sc.nextInt();
        Arrays.sort(hamburger);
        Arrays.sort(juice);
        System.out.println(hamburger[0]+juice[0]-50);
    }
}
