import java.util.Scanner;

public class Baekjun_14924 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int train = sc.nextInt();
        int fly = sc.nextInt();
        int distance = sc.nextInt();
        int result = distance/(train*2);
        System.out.println(result*fly);
    }
}
