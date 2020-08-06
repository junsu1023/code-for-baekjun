import java.io.*;

public class Baekjun_4597 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            StringBuilder sb = new StringBuilder();
            String stream = br.readLine();
            if(stream.equals("#")) break;
            int one_cnt = 0;
            char check = stream.charAt(stream.length()-1);
            for(int i=0; i<stream.length()-1; i++){
                sb.append(stream.charAt(i));
                if(stream.charAt(i) == '1') one_cnt++;
            }
            if(check == 'e'){
                if(one_cnt%2==0) sb.append(0);
                else sb.append(1);
            }
            else if(check == 'o'){
                if(one_cnt%2==0) sb.append(1);
                else sb.append(0);
            }
            bw.write(sb.toString() + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
