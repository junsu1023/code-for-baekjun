import java.util.Scanner;

public class Baekjun_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = sc.nextInt();
        for(int i=0; i<num; i++) {
            int input = sc.nextInt();
            if(input < max) System.out.print(input + " ");
        }
    }
}
