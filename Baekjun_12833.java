import java.util.Scanner;

public class Baekjun_12833 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            a = a^b;
        }
        System.out.println(a);
    }
}
