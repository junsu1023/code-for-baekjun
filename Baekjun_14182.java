import java.util.Scanner;

public class Baekjun_14182 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            long money = sc.nextInt();
            if(money == 0) break;
            long have = 0;
            if(money <= 1000000) have = money;
            else if(money > 1000000 && money <=5000000) have = (long)(money * 0.9);
            else if(money > 5000000) have = (long)(money * 0.8);
            System.out.println(have);
        }
    }
}
