import java.util.Scanner;

public class Baekjun_2712 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for (int tc = 0; tc < test_case; tc++) {
            double amount = sc.nextDouble();
            String unit = sc.next();
            double change_amount = 0;
            String change_unit = "";
            if (unit.equals("kg")) {
                change_amount = amount * 2.2046;
                change_unit = "lb";
            } else if (unit.equals("l")) {
                change_amount = amount * 0.2642;
                change_unit = "g";
            } else if (unit.equals("lb")) {
                change_amount = amount * 0.4536;
                change_unit = "kg";
            } else if (unit.equals("g")) {
                change_amount = amount * 3.7854;
                change_unit = "l";
            }
            System.out.printf("%.4f %s\n", change_amount, change_unit);
        }
    }
}
