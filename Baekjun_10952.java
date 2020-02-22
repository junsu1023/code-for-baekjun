import java.util.Scanner;

public class Baekjun_10952 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            int A = input.nextInt();
            int B = input.nextInt();
            if(A==0 && B==0) break;
            System.out.println(A+B);
        }
    }
}
