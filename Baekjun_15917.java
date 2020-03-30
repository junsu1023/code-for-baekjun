import java.util.Scanner;

public class Baekjun_15917 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int n = sc.nextInt();
            boolean check = true;
            while(n != 0){
                if(n>1 && n%2==1) check = false;
                n/=2;
            }
            if(check) System.out.println(1);
            else System.out.println(0);
        }
    }
}
