import java.util.Scanner;

public class Baekjun_10175 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        sc.nextLine();
        for(int tc=0; tc<test_case; tc++){
            String input1 = sc.next();
            String input2 = sc.next();
            int[] cnt = new int[4];
            for(int i=0; i<input2.length(); i++){
                if(input2.charAt(i)=='B') cnt[0]+=2;
                else if(input2.charAt(i)=='C') cnt[1]+=1;
                else if(input2.charAt(i)=='M') cnt[2]+=4;
                else if(input2.charAt(i)=='W') cnt[3]+=3;
            }
            int max_cnt = 0;
            int max = 0;
            String word = "";
            for(int i=0; i<4; i++){
                if(max < cnt[i]){
                    max = cnt[i];
                    max_cnt = 0;
                    if(i==0) word = "Bobcat";
                    else if(i==1) word = "Coyote";
                    else if(i==2) word = "Mountain Lion";
                    else if(i==3) word = "Wolf";
                }
                else if(max == cnt[i]) max_cnt++;
            }
            if(max_cnt!=0) System.out.println(input1 + ": There is no dominant species");
            else System.out.println(input1 + ": The " + word + " is the dominant species");
        }
    }
}
