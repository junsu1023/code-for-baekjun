import java.util.Scanner;

public class Baekjun_2747 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int temp = 0;
        for(int i=1; i<num; i++){
            temp = n1;
            n1 = n2;
            n2 = temp + n1;
        }
        System.out.println(n2);
    }
}
