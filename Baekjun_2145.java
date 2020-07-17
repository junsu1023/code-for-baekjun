import java.util.Scanner;

public class Baekjun_2145 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        while(true){
            int num = sc.nextInt();
            if(num == 0) break;
            while(num >= 10){
                int temp = num;
                int temp2 = 0;
                while(temp > 0){
                    temp2 += temp%10;
                    temp/=10;
                }
                num = temp2;
            }
            System.out.println(num);
        }
    }
}
