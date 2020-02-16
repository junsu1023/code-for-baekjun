import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cal = br.readLine();
        String[] str = cal.split("\\-");
        int minSum = 0;
        for(int i=0; i<str.length; i++){
            String[] str2 = str[i].split("\\+");
            int tempSum = 0;
            for(String j:str2) tempSum += Integer.parseInt(j);
            if(i==0) tempSum *= -1;
            minSum -= tempSum;
        }
        System.out.println(minSum);
    }
}
