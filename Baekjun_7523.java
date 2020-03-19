import java.util.Scanner;

public class Baekjun_7523 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            long n1 = sc.nextInt();
            long n2 = sc.nextInt();
            long num = n2-n1+1;
            long result = 0;
            if(num%2==0) result = (n1+n2) * (num/2);
            else result = (n1+n2) * (num/2) + (n1+n2)/2;
            System.out.println("Scenario #" + (tc+1) + ":");
            System.out.println(result + "\n");
        }
    }
}
