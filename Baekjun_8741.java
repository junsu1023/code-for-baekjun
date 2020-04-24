import java.util.Scanner;

public class Baekjun_8741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) sb.append(1);
        for(int i=0; i<n-1; i++) sb.append(0);
        System.out.println(sb);
    }
}
