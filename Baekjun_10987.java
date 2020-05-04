import java.util.Scanner;

public class Baekjun_10987 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        int cnt = 0;
        for(int i=0; i<line.length(); i++){
            if(line.charAt(i)=='a' || line.charAt(i)=='e' || line.charAt(i)=='u' || line.charAt(i)=='o' || line.charAt(i)=='i')
                cnt++;
        }
        System.out.println(cnt);
    }
}
