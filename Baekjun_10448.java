import java.util.Scanner;

public class Baekjun_10448 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int num = sc.nextInt();
            boolean check = false;
            for(int i=1; i<=45; i++){
                for(int j=1; j<=45; j++){
                    for(int k=1; k<=45; k++){
                        if(num == tnum(i)+tnum(j)+tnum(k)) check = true;
                    }
                }
            }
            if(check) System.out.println(1);
            else System.out.println(0);
        }
    }
    public static int tnum(int n){
        return n*(n+1)/2;
    }
}
