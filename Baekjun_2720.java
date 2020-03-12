import java.util.Scanner;

public class Baekjun_2720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int change = sc.nextInt();
            int quarter = change/25;
            change %= 25;
            int dime = change/10;
            change %= 10;
            int nickel = change/5;
            change %= 5;
            int penny = change/1;
            change%=1;
            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }

}
