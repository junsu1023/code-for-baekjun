import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_13771 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        double[] price = new double[test_case];
        for(int i=0; i<test_case; i++){
            price[i] = sc.nextDouble();
        }
        Arrays.sort(price);
        System.out.println(String.format("%.2f", price[1]));
    }
}
