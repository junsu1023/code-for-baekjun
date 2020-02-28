import java.util.Scanner;

public class Baekjun_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stick = 64;
        int count = 0;
        int length = sc.nextInt();
        while(length != 0){
            if(stick > length) stick/=2;
            else{
                count++;
                length -= stick;
            }
        }
        System.out.println(count);
    }
}
