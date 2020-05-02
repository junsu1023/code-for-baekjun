import java.util.Scanner;

public class Baekjun_10820 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String line = sc.nextLine();
            int s_cnt = 0;
            int b_cnt = 0;
            int n_cnt = 0;
            int space_cnt = 0;
            for(int i=0; i<line.length(); i++){
                if(line.charAt(i)>='a' && line.charAt(i)<='z') s_cnt++;
                else if(line.charAt(i)>='A' && line.charAt(i)<='Z') b_cnt++;
                else if(line.charAt(i)>='0' && line.charAt(i)<='9') n_cnt++;
                else if(line.charAt(i)==' ') space_cnt++;
            }
            System.out.println(s_cnt + " " + b_cnt + " " + n_cnt + " " + space_cnt);
        }
    }
}
