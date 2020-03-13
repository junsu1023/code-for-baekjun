import java.util.Scanner;

public class Baekjun_2921 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = (num * (num+1) * (num+2))/2;
        System.out.println(sum);
    }
}
