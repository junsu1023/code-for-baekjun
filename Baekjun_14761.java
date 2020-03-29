import java.util.Scanner;

public class Baekjun_14761 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            if(i%n1==0 && i%n2==0) System.out.println("FizzBuzz");
            else if(i%n1==0) System.out.println("Fizz");
            else if(i%n2==0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
}
