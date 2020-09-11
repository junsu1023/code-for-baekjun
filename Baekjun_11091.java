import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_11091 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        for(int tc=0; tc<test_case; tc++){
            StringBuilder sb = new StringBuilder();
            String s = br.readLine();
            int[] arr = new int[26];
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)>='a' && s.charAt(i)<='z') arr[(int)s.charAt(i)-97] = 1;
                else if(s.charAt(i)>='A' && s.charAt(i)<='Z') arr[(int)s.charAt(i)-65] = 1;
            }
            boolean check = true;
            for(int i=0; i<26; i++){
                if(arr[i] != 1){
                    check = false;
                    sb.append((char)(i + 97));
                }
            }
            if(check) System.out.println("pangram");
            else System.out.println("missing " + sb.toString());
        }
        br.close();
    }
}
