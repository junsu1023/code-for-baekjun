import java.util.Scanner;

public class Baekjun_5724 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n==0) break;
            long square = 0;
            for(int i=n; i>=1; i--){
                square += i*i;
            }
            System.out.println(square);
        }
    }
}
