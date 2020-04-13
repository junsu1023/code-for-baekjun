import java.util.Scanner;

public class Baekjun_2857 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=5; i++){
            String agient = sc.nextLine();
            if(agient.contains("FBI")) sb.append(i + " ");
        }
        if(sb.length() == 0) System.out.println("HE GOT AWAY!");
        else System.out.println(sb);
    }
}
