import java.util.Scanner;

public class Baekjun_17362 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%8>=1 && num%8<=5) System.out.println(num%8);
        else if(num%8==6) System.out.println(4);
        else if(num%8==7) System.out.println(3);
        else if(num%8==0) System.out.println(2);
    }
}
