import java.util.Scanner;

public class Baekjun_15667 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for(int i=1; i<n; i++){
            if(i+i*i==n-1) result = i;
        }
        System.out.println(result);
    }
}
