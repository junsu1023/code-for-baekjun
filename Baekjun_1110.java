import java.util.Scanner;

public class Baekjun_1110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int one = 0;
        int two = 0;
        int cnt = 0;
        int save = 0;
        one = num / 10;
        two = num % 10;

        while (true) {
            cnt++;
            save = two;
            two = (one + two) % 10;
            one = save;

            if (num == one * 10 + two)
                break;
        }
        System.out.println(cnt);
    }
}
