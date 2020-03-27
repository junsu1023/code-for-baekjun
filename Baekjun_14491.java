import java.util.Scanner;

public class Baekjun_14491 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int result = 0;
        while(n>0){
            result += (int)(n%9 * Math.pow(10, cnt++));
            n/=9;
        }
        System.out.println(result);
    }
}
