import java.util.Scanner;

public class Baekjun_7789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int add = sc.nextInt();
        int convert = add*1000000 + number;
        boolean check = true;
        for(int i=2; i<number/2; i++){
            if(number%i==0) check = false;
        }
        for(int i=2; i<convert/2; i++){
            if(convert%i==0) check = false;
        }
        if(check) System.out.println("Yes");
        else System.out.println("No");
    }
}
