import java.util.Scanner;

public class Baekjun_4493 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int play = sc.nextInt();
            int cnt1 = 0;
            int cnt2 = 0;
            for(int i=0; i<play; i++){
                String rsp1 = sc.next();
                String rsp2 = sc.next();
                if(rsp1.equals("R") && rsp2.equals("S")) cnt1+=1;
                else if(rsp1.equals("R") && rsp2.equals("P")) cnt2+=1;
                else if(rsp1.equals("S") && rsp2.equals("P")) cnt1+=1;
                else if(rsp1.equals("S") && rsp2.equals("R")) cnt2+=1;
                else if(rsp1.equals("P") && rsp2.equals("R")) cnt1+=1;
                else if(rsp1.equals("P") && rsp2.equals("S")) cnt2+=1;
            }
            if(cnt1 > cnt2) System.out.println("Player 1");
            else if(cnt1 < cnt2) System.out.println("Player 2");
            else System.out.println("TIE");
        }
    }
}
