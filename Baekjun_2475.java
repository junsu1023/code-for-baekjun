import java.util.Scanner;

public class Baekjun_2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num  =new int[5];
        for(int i=0; i<5; i++) num[i] = sc.nextInt();
        int sum = 0;
        for(int i=0; i<5; i++) sum += num[i]*num[i];
        int result = sum%10;
        System.out.println(result);
    }
}
