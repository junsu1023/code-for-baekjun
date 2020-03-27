import java.util.Scanner;

public class Baekjun_14489 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        long total = m1 + m2;
        long chicken = sc.nextInt();
        if(total < chicken*2) System.out.println(total);
        else System.out.println(total - chicken*2);
    }
}
