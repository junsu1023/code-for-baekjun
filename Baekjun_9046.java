import java.util.Scanner;

public class Baekjun_9046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        sc.nextLine();
        for(int tc=0; tc<test_case; tc++){
            int[] cnt = new int[26];
            String arr = sc.nextLine();
            for(int i=0; i<arr.length(); i++){
                if(arr.charAt(i) != ' ') cnt[arr.charAt(i)-97]++;
            }
            int max = 0;
            int index = 0;
            int check = 0;
            for(int i=0; i<26; i++){
                if(cnt[i] > max){
                    index = i;
                    max = cnt[i];
                    check = 0;
                }
                else if(max == cnt[i]) check = 1;
            }
            if(check == 0) System.out.println((char)(index+97));
            else System.out.println("?");
        }
    }
}
