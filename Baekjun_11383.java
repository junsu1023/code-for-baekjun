import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_11383 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] str1 = new String[n];
        String[] str2 = new String[n];
        String[] str3 = new String[n];
        boolean check = true;
        for(int i=0; i<n; i++) str1[i] = br.readLine();
        for(int i=0; i<n; i++) str2[i] = br.readLine();
        for(int i=0; i<n; i++){
            for(int j=0; j<str2[i].length(); j++){
                if(str2[i].charAt(j) != str1[i].charAt(j/2)) check = false;
            }
        }
        if(check) System.out.println("Eyfa");
        else System.out.println("Not Eyfa");
        br.close();
    }
}
