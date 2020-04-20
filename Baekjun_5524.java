import java.util.Scanner;

public class Baekjun_5524 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        sc.nextLine();
        for(int tc=0; tc<test_case; tc++){
            StringBuilder sb = new StringBuilder();
            String line = sc.nextLine();
            for(int i=0; i<line.length(); i++){
                if(line.charAt(i) >= 'A' && line.charAt(i) <= 'Z') sb.append((char)(line.charAt(i) + 32));
                else sb.append(line.charAt(i));
            }
            System.out.println(sb);
        }
    }
}
