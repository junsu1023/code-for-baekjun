import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_1864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int cnt = 0;
        while (true) {
            String octopus_num = br.readLine();
            if(octopus_num.equals("#")) break;
            for(int i=0; i<octopus_num.length(); i++){
                int temp = 0;
                switch (octopus_num.charAt((i))){
                    case '-':
                        temp = 0; break;
                    case '\\':
                        temp = 1; break;
                    case '(':
                        temp = 2; break;
                    case '@':
                        temp = 3; break;
                    case '?':
                        temp = 4; break;
                    case '>':
                        temp = 5; break;
                    case '&':
                        temp = 6; break;
                    case '%':
                        temp = 7; break;
                    case '/':
                        temp = -1; break;
                }
                sum += temp*Math.pow(8, octopus_num.length()-1-cnt);
                cnt++;
            }
            System.out.println(sum);
            cnt = 0;
            sum = 0;
        }
        br.close();
    }
}
