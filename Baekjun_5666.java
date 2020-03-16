import java.util.Scanner;

public class Baekjun_5666 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            double hotdog = sc.nextInt();
            double person = sc.nextInt();
            String result = String.format("%.2f", hotdog/person);
            System.out.println(result);
        }
    }
}
