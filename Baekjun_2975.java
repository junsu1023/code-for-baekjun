import java.util.Scanner;

public class Baekjun_2975 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int origin = sc.nextInt();
            char op = sc.next().charAt(0);
            int add = sc.nextInt();
            int result = 0;
            if(origin == 0 && op == 'W' && add ==0) break;
            if(op=='W') result = origin - add;
            else if(op == 'D') result = origin + add;
            if(result < -200) System.out.println("Not allowed");
            else System.out.println(result);
        }
    }

}
