import java.util.Scanner;

public class Baekjun_1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int temp = (num1/100)*100;
        while(true){
            if(temp%num2==0){
                int result = temp%100;
                if(result<10) System.out.println("0" + result);
                else System.out.println(result);
                return;
            }
            temp++;
        }
    }
}