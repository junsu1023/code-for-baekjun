import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_11319 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String s = br.readLine();
            int con = 0;
            int vow = 0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j)!=' ') {
                    if (s.charAt(j) == 'A' || s.charAt(j) == 'E' || s.charAt(j) == 'I' || s.charAt(j) == 'O' || s.charAt(j) == 'U'
                            || s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u')
                        vow++;
                    else con++;
                }
            }
            System.out.println(con + " " + vow);
        }
        br.close();
    }
}
