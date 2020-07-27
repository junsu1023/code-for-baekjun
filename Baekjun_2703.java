import java.util.Scanner;

public class Baekjun_2703 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        sc.nextLine();
        for(int tc=0; tc<test_case; tc++){
            StringBuilder sb = new StringBuilder();
            String en = sc.nextLine();
            String rule = sc.nextLine();
            int pos = 0;
            for(int i=0; i<en.length(); i++){
                if(en.charAt(i) == ' ') sb.append(" ");
                else{
                    pos = (int)en.charAt(i) - 65;
                    sb.append(rule.charAt(pos));
                }
            }
            System.out.println(sb.toString());
        }
    }
}
