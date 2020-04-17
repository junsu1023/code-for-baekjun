import java.util.Scanner;

public class Baekjun_4470 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        sc.nextLine();
        for(int tc=0; tc<test_case; tc++){
            StringBuilder sb = new StringBuilder();
            String line = sc.nextLine();
            sb.append((tc+1) + ". " + line);
            System.out.println(sb);
        }
    }
}
