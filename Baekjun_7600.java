import java.util.Scanner;

public class Baekjun_7600 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            boolean[] alpha = new boolean[91];
            String line = sc.nextLine();
            if(line.equals("#")) break;
            for(int i=0; i<line.length(); i++){
                if(line.charAt(i)>='a' && line.charAt(i)<='z') alpha[line.charAt(i)-32] = true;
                if(line.charAt(i)>='A' && line.charAt(i)<='Z') alpha[line.charAt(i)] = true;
            }
            int cnt = 0;
            for(int i=65; i<91; i++){
                if(alpha[i]) cnt++;
            }
            System.out.println(cnt);
        }
    }
}
