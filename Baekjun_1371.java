import java.util.Scanner;

public class Baekjun_1371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alpha = new int[26];
        int max = 0;
        while(sc.hasNextLine()){
            String sentence = sc.nextLine();
            for(int i=0; i<sentence.length(); i++){
                if(sentence.charAt(i) != ' '){
                    alpha[sentence.charAt(i) - 'a']++;
                    if(max < alpha[sentence.charAt(i) - 'a'])
                        max = alpha[sentence.charAt(i) - 'a'];
                }
            }
        }
        for(int i=0; i<26; i++){
            if(alpha[i] == max) System.out.print((char)(i + 'a'));
        }
    }
}
