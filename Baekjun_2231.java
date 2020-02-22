import java.util.Scanner;

public class Baekjun_2231 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(result(num));
    }
    public static int Rest(int num){
        int temp = num;
        while(num!=0){
            int rest = num%10;
            temp+=rest;
            num/=10;
        }
        return temp;
    }

    public static int result(int num){
        for(int i=0; i<=1000000; i++){
            if(Rest(i) == num)
                return i;
        }
        return 0;
    }
}
