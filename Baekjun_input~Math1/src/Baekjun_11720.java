import java.util.Scanner;

public class Baekjun_11720 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String arr = input.next();
        int sum = 0;

        for(int i=0; i<num; i++) {
            sum += arr.charAt(i)-48;
        }
        System.out.println(sum);
    }
}
