import java.util.Scanner;

public class Baekjun_10698 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int n1 = sc.nextInt();
            char op1 = sc.next().charAt(0);
            int n2 = sc.nextInt();
            String op2 = sc.next();
            int n3 = sc.nextInt();
            String check = "";
            if(op1=='+'){
                if(n1+n2==n3) check = "YES";
                else check = "NO";
            }
            else if(op1=='-'){
                if(n1-n2==n3) check = "YES";
                else check = "NO";
            }
            System.out.println("Case " + (tc+1) + ": " + check);
        }
    }
}
