import java.util.Scanner;

public class Baekjun_13985{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] calculation = sc.nextLine().split("");
        int result = Integer.parseInt(calculation[0]) + Integer.parseInt(calculation[4]);
        if(result == Integer.parseInt(calculation[8])) System.out.println("YES");
        else System.out.println("NO");
    }
}