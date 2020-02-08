import java.util.Scanner;

public class Baekjun_2839 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kg = input.nextInt();

        if(kg%5==0){
            System.out.println(kg/5);
            return;
        }
        else{
            int quotient = kg/5;
            for(int i=quotient; i>0; i--){
                int temp = kg-(i*5);
                if(temp%3==0){
                    System.out.println(i+(temp/3));
                    return;
                }
            }
        }
        if(kg%3==0)
            System.out.println(kg/3);
        else
            System.out.println(-1);
    }
}
