import java.util.Scanner;

public class Baekjun_1193 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum=0;
        int i=0;

        while(i+sum<num)
                sum += i++;

        int denominator=0;
        if(i%2==0) denominator = num-sum;
        else denominator = i+1-(num-sum);
        int numerator=i+1-denominator;
        System.out.printf("%d/%d", denominator, numerator);
    }
}
