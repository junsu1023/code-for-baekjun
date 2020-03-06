import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjun_17863 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        String[] num = number.split("");
        int[] convert = new int[7];
        for(int i=0; i<num.length; i++) convert[i] = Integer.parseInt(num[i]);
        if(convert[0] == 5 && convert[1] == 5 && convert[2] == 5){
            if(convert[3]==convert[5] && convert[4] == convert[6]) {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        else System.out.println("NO");
    }
}
