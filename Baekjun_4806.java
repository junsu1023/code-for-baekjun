import java.util.Scanner;

public class Baekjun_4806 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        while(sc.hasNextLine()){
            String arr = sc.nextLine();
            cnt++;
        }
        System.out.println(cnt);
    }
}
