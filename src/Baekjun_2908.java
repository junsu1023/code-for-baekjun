import java.util.Scanner;

public class Baekjun_2908 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int word1 = input.nextInt();
        int word2 = input.nextInt();

        int first = reverse(word1);
        int second = reverse(word2);
        if(first>second) System.out.println(first);
        else System.out.println(second);

    }

    public static int reverse(int input){
        int result = 0;
        while(input!=0){
            result = result*10 + input%10;
            input /= 10;
        }
        return result;
    }
}
