import java.util.Scanner;

public class Baekjun_1673 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp1 = 0;
        int temp2 = 0;
        while(sc.hasNext()){
            int coupon = sc.nextInt();
            int stamp = sc.nextInt();
            temp1 = coupon;
            temp2 = coupon;
            while(temp1 >= stamp){
                temp1 -= stamp;
                temp1++;
                temp2++;
            }
            System.out.println(temp2);
        }
    }
}
