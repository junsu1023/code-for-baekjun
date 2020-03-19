import java.util.Scanner;

public class Baekjun_7595 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true){
            int n = sc.nextInt();
            if(n==0) break;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    sb.append("*");
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
