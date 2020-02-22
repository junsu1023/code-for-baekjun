import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int[] num = new int[test_case];
        for(int tc=0; tc<test_case; tc++) num[tc] = sc.nextInt();
        Arrays.sort(num);
        System.out.println(num[0] + " " + num[test_case-1]);
    }
}
