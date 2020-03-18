import java.util.Scanner;

public class Baekjun_7510 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int i=0; i<test_case; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println("Scenario #" + (i+1) + ":");
            if(c*c == a*a + b*b || b*b == a*a + c*c || a*a == b*b + c*c) System.out.println("yes" + "\n");
            else System.out.println("no" + "\n");
        }
    }

}
