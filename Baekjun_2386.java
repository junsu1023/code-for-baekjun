import java.util.Scanner;

public class Baekjun_2386 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            char alpha = sc.next().charAt(0);
            if(alpha == '#') break;
            String sentence = sc.nextLine();
            int cnt = 0;
            for(int i=0; i<sentence.length(); i++){
                if(sentence.charAt(i)>='a' && sentence.charAt(i)<='z'){
                    if(alpha == sentence.charAt(i) || alpha == Character.toUpperCase(sentence.charAt(i))) cnt++;
                }
                else if(sentence.charAt(i)>='A' && sentence.charAt(i)<='Z'){
                    if(alpha == sentence.charAt(i) || alpha == Character.toLowerCase(sentence.charAt(i))) cnt++;
                }
            }
            System.out.println(alpha + " " + cnt);
        }
    }
}
