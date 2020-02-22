import java.util.Scanner;

public class Baekjun_1065 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num < 100) System.out.println(num);
        else{
            int result = 99;
            for(int i=100; i<=num; ++i){
                result += Hansu(i);
            }
            if (num == 1000) result--;
            System.out.println(result);
        }
    }
    public static int Hansu(int num){
        int num1 = num/100;
        int num2 = num/10%10;
        int num3 = num%10;
        if(num2*2 == num1+num3) return 1;
        return 0;
    }
}
