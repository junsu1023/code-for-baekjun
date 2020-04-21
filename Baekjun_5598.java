import java.util.Scanner;

public class Baekjun_5598 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String code = sc.nextLine();
        for(int i=0; i<code.length(); i++){
            if(code.charAt(i)>='D' && code.charAt(i)<='Z') sb.append((char)(code.charAt(i)-3));
            else if(code.charAt(i)>='A' && code.charAt(i)<='C') sb.append((char)(code.charAt(i)+23));
        }
        System.out.println(sb);
    }
}
