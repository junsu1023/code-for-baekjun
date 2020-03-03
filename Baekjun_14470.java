import java.util.Scanner;

public class Baekjun_14470 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); int B = sc.nextInt();
        int C = sc.nextInt(); int D = sc.nextInt();
        int E = sc.nextInt();
        int result = 0;
        if(A<0)   result = -A*C + D + B*E;
        else result = E*(B-A);
        System.out.println(result);
    }
}
