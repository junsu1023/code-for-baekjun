import java.util.Scanner;

public class Baekjun_11719 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while(sc.hasNextLine()) {
            str =sc.nextLine();
            if(str.length()==0) break;
            System.out.println(str);
        }
        sc.close();
    }
}
