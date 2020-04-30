import java.util.Scanner;

public class Baekjun_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int[] cnt = new int[26];
        for(int i=0; i<word.length(); i++){
            cnt[word.charAt(i)-97]++;
        }
        for(int i=0; i<cnt.length; i++) System.out.print(cnt[i] + " ");
    }
}
