import java.util.Scanner;

public class Baekjun_2292 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int result = 1;
        int cnt = 1;
        int sum = 6;
        while(true){
            if(num<=cnt){
                break;
            }
            cnt+=sum;
            sum+=6;
            result++;
        }
        System.out.println(result);
    }
}
