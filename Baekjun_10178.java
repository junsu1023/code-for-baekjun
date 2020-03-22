import java.util.Scanner;

public class Baekjun_10178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int candy = sc.nextInt();
            int bro = sc.nextInt();
            int share = candy/bro;
            int rest = candy%bro;
            System.out.println("You get " + share + " piece(s) and your dad gets " + rest + " piece(s).");
        }
    }
}
