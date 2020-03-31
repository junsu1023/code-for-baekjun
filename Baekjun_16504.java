import java.util.Scanner;

public class Baekjun_16504 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int num = sc.nextInt();
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
