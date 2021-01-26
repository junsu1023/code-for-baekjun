import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_2998 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        StringBuilder replace = new StringBuilder();
        while(n.length() % 3 != 0){
            n = "0" + n;
        }
        for(int i=0; i<n.length()-1; i+=3){
            int temp = ((n.charAt(i) - '0') * 4) + ((n.charAt(i+1) - '0') * 2) + (n.charAt(i+2) - '0');
            replace.append(temp);
        }
        System.out.println(replace.toString());
        br.close();
    }
}
