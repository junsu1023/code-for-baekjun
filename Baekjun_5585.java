import java.util.Scanner;

public class Baekjun_5585 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int rest = 1000-price;
        int cnt = 0;
        while(rest != 0){
            if(rest >= 500){
                cnt += rest/500;
                rest %= 500;
            }
            else if(rest >= 100){
                cnt += rest/100;
                rest %= 100;
            }
            else if(rest >= 50){
                cnt += rest/50;
                rest %= 50;
            }
            else if(rest >= 10){
                cnt += rest/10;
                rest %= 10;
            }
            else if(rest >= 5){
                cnt += rest/5;
                rest %= 5;
            }
            else if(rest >= 1){
                cnt += rest/1;
                rest = 0;
            }
        }
        System.out.println(cnt);
    }
}
