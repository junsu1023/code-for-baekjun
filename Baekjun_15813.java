import java.util.Scanner;

public class Baekjun_15813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' ') sum += (int)(s.charAt(i) - 64);
        }
        System.out.println(sum);
    }
}
