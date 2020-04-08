import java.util.Scanner;

public class Baekjun_1919 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int[] alpha1 = new int[26];
        int[] alpha2 = new int[26];
        for(int i=0; i<a.length(); i++) alpha1[a.charAt(i) - 'a']++;
        for(int i=0; i<b.length(); i++) alpha2[b.charAt(i) - 'a']++;
        int sum = 0;
        for(int i=0; i<26; i++){
            if(alpha1[i] != alpha2[i]) sum += Math.abs(alpha1[i] - alpha2[i]);
        }
        System.out.println(sum);
    }
}
