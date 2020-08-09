import java.io.*;

public class Baekjun_5698 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            String[] s = br.readLine().split(" ");
            boolean check = true;
            if(s[0].equals("*")) break;
            char compare = s[0].charAt(0);
            if(s[0].charAt(0) >= 'a' && s[0].charAt(0) <= 'z') compare = (char)(s[0].charAt(0) - 32);
            for(int i=1; i<s.length; i++){
                if(s[i].charAt(0) >= 'a' && s[i].charAt(0) <= 'z'){
                    if((char)(s[i].charAt(0) - 32) != compare){
                        check = false;
                    }
                }
                else{
                    if(s[i].charAt(0) != compare) check = false;
                }
            }
            if(check) bw.write("Y\n");
            else bw.write("N\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
