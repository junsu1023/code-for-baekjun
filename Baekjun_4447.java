import java.util.Scanner;

public class Baekjun_4447 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        sc.nextLine();
        for(int tc=0; tc<test_case; tc++){
            String name = sc.nextLine();
            int g_cnt = 0;
            int b_cnt = 0;
            for(int i=0; i<name.length(); i++){
                if(name.charAt(i) == 'g' ||name.charAt(i) == 'G') g_cnt++;
                else if(name.charAt(i) == 'b' ||name.charAt(i) == 'B') b_cnt++;
            }
            if(g_cnt > b_cnt) System.out.println(name + " is GOOD");
            else if(g_cnt < b_cnt) System.out.println(name + " is A BADDY");
            else System.out.println(name + " is NEUTRAL");
        }
    }
}
