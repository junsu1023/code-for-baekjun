import java.io.*;

public class Baekjun_6996 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int tc=0; tc<n; tc++){
            int[] alpha1 = new int[26];
            int[] alpha2 = new int[26];
            String[] s = br.readLine().split(" ");
            String origin = s[0];
            String change = s[1];
            String ans = "";
            if(origin.length() != change.length()) ans = " are NOT anagrams.";
            else{
                boolean check = true;
                for(int i=0; i<origin.length(); i++) alpha1[(int)(origin.charAt(i)-97)]++;
                for(int i=0; i<change.length(); i++) alpha2[(int)(change.charAt(i)-97)]++;
                for(int i=0; i<origin.length(); i++){
                    if(alpha1[i] != alpha2[i]) check = false;
                }
                if(check) ans = " are anagrams.";
                else ans = " are NOT anagrams.";
            }
            bw.write(s[0] + " & " + s[1] + ans + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
