import java.util.Scanner;

public class Baekjun_5613 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n;
        while(true){
            String op = sc.next();
            if(op.equals("=")) break;
            int input = sc.nextInt();
            if(op.equals("+")) sum += input;
            else if(op.equals("-")) sum -= input;
            else if(op.equals("*")) sum *= input;
            else if(op.equals("/")) sum /= input;
        }
        System.out.println(sum);
    }
}
