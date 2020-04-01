import java.util.Scanner;

public class Baekjun_16673 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += k*i + p*i*i;
        }
        System.out.println(sum);
    }
}
