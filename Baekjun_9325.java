import java.util.Scanner;

public class Baekjun_9325 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int car_price = sc.nextInt();
            int option = sc.nextInt();
            int total_opion = 0;
            for(int i=0; i<option; i++){
                int onum = sc.nextInt();
                int oprice = sc.nextInt();
                total_opion += onum * oprice;
            }
            int total_price = car_price + total_opion;
            System.out.println(total_price);
        }
    }
}
