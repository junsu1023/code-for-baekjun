import java.util.Scanner;

public class Baekjun_2744 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String word = sc.nextLine();
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) >= 97 && word.charAt(i) <= 122) sb.append((char)(word.charAt(i) - 32));
            else if(word.charAt(i) >= 65 && word.charAt(i) <= 90) sb.append((char)(word.charAt(i) + 32));
        }
        System.out.println(sb);
    }
}
