import java.util.Scanner;

public class Baekjun_5554 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] second = new int[4];
        int sum = 0;
        for(int i=0; i<4; i++){
            second[i] = sc.nextInt();
            sum += second[i];
        }
        System.out.println(sum/60);
        System.out.println(sum%60);
    }
}
