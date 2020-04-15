import java.util.Scanner;

public class Baekjun_2864 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        String temp1 = num1;
        String temp2 = num2;
        num1 = num1.replace("6", "5");
        num2 = num2.replace("6", "5");
        long min = Integer.parseInt(num1) + Integer.parseInt(num2);
        temp1 = temp1.replace("5", "6");
        temp2 = temp2.replace("5", "6");
        long max = Integer.parseInt(temp1) + Integer.parseInt(temp2);
        System.out.println(min + " " + max);
    }
}
