import java.util.Scanner;

public class Baekjun_10474 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int numerator = sc.nextInt();
            int denominator = sc.nextInt();
            if(numerator==0 && denominator==0) break;
            int share = numerator/denominator;
            int nu = 0;
            if(numerator < denominator) nu = numerator;
            else nu = numerator - share * denominator;
            System.out.println(share + " " + nu + " / " + denominator);
        }
    }
}
