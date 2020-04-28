import java.util.Scanner;

public class Baekjun_10174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        sc.nextLine();
        for (int tc = 0; tc < test_case; tc++) {
            String sentence = sc.nextLine();
            boolean check = true;
            for (int i = 0; i < sentence.length(); i++) {
                char c1 = sentence.charAt(i);
                char c2 = sentence.charAt(sentence.length() - i - 1);
                if (c1 >= 'A' && c1 <= 'Z') c1 = (char) (c1 + 32);
                if (c2 >= 'A' && c2 <= 'Z') c2 = (char) (c2 + 32);
                if (c1 != c2) {
                    check = false;
                    continue;
                }
            }
            if (check) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
