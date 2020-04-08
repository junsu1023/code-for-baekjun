import java.util.Scanner;

public class Baekjun_1871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            String number = sc.next();
            String a = number.split("-")[0];
            String b = number.split("-")[1];
            int sum1 = 0;
            for(int i=0; i<a.length(); i++){
                int value = a.charAt(i) - 'A';
                value *= Math.pow(26, 2-i);
                sum1 += value;
            }
            int sum2 = Integer.parseInt(b);
            if(Math.abs(sum1-sum2)<=100) System.out.println("nice");
            else System.out.println("not nice");
        }
    }
}
