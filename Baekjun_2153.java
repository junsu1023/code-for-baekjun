import java.util.Scanner;

public class Baekjun_2153 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int sum = 0;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') sum += word.charAt(i) - 'A' + 1;
            else if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z') sum += word.charAt(i) - 'a' + 1;
        }
        int cnt = 0;
        for(int i=1; i<=sum; i++){
            if(sum%i==0) cnt++;
        }
        if(cnt<=2) System.out.println("It is a prime word.");
        else System.out.println("It is not a prime word.");
    }
}
