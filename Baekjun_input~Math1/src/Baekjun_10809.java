import java.util.Scanner;

public class Baekjun_10809 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String enter = input.next();
        for(char i='a'; i<='z'; i++){
            System.out.print(enter.indexOf(i) + " ");
        }
    }
}
