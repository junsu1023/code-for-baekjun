import java.util.Scanner;

public class Baekjun_11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i=2;
        while(num>=i){
            if(num%i==0){
                System.out.println(i);
                num/=i;
            }
            else i++;
        }
    }
}
