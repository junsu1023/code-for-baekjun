import java.util.Scanner;

public class Baekjun_17174 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int temp = n;
        while(temp >= m){
            n += temp/m;
            temp/=m;
        }
        System.out.println(n);
    }
}
