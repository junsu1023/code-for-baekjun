import java.io.*;

public class Baekjun_9946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = 1;
        while(true){
            StringBuilder sb = new StringBuilder();
            String origin = br.readLine();
            String withdraw = br.readLine();
            if(origin.equals("END") && withdraw.equals("END")) break;
            int[] alpha1 = new int[26];
            int[] alpha2 = new int[26];
            boolean check = true;
            sb.append("Case ").append(cnt).append(": ");
            if(origin.length() != withdraw.length()) sb.append("different");
            else{
                for(int i=0; i<origin.length(); i++) alpha1[(int)origin.charAt(i)-97]++;
                for(int i=0; i<withdraw.length(); i++) alpha2[(int)withdraw.charAt(i)-97]++;
                for(int i=0; i<alpha1.length; i++){
                    if(alpha1[i] != alpha2[i]){
                        check = false;
                        break;
                    }
                }
                if(check) sb.append("same");
                else sb.append("different");
            }
            bw.write(sb.toString() + "\n");
            cnt++;
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
