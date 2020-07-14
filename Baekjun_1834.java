import java.util.Scanner;

public class Baekjun_1834 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for(int i=0; i<n; i++){
            sum += (n+1)*i;
        }
        System.out.println(sum);
    }
}
