import java.util.Scanner;

public class Baekjun_2909 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int k = sc.nextInt();
        int n = 1;
        for(int i=0; i<k; i++) n *= 10;
        long temp = n / 10;
        long result = (c + (temp * 5)) / (temp * 10) * (temp * 10);
        System.out.println(result);
    }
}
