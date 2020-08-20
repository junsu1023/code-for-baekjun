import java.io.*;

public class Baekjun_9492 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;
            String[] word = new String[n];
            for(int i=0; i<n; i++){
                word[i] = br.readLine();
            }
            boolean flag = true;
            if(n%2==1) flag = false;
            String[] fword = new String[n/2];
            String[] eword = new String[n/2];
            String mid = "";
            if(flag){
                for(int i=0; i<n; i++){
                    if(i < n/2) fword[i] = word[i];
                    else eword[n/2-n+i] = word[i];
                }
                for(int i=0; i<n/2; i++){
                    sb.append(fword[i]).append("\n");
                    sb.append(eword[i]).append("\n");
                }
            }
            else{
                for(int i=0; i<n; i++){
                    if(i < n/2) fword[i] = word[i];
                    else if(i == n/2) mid = word[i];
                    else eword[n/2-n+i] = word[i];
                }
                for(int i=0; i<n/2; i++){
                    sb.append(fword[i]).append("\n");
                    sb.append(eword[i]).append("\n");
                }
                sb.append(mid).append("\n");
            }
            bw.write(sb.toString());
        }
        bw.flush();
        br.close();
        bw.close();
    }
}