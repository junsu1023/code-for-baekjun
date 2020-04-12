import java.util.Scanner;

public class Baekjun_2711 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            int pos = sc.nextInt();
            String word = sc.next();
            for(int j=0; j<word.length(); j++){
                if(j != pos-1) sb.append(word.charAt(j));
            }
            System.out.println(sb);
        }
    }
}
