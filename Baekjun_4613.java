import java.io.*;

public class Baekjun_4613 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            String s = br.readLine();
            if(s.equals("#")) break;
            int sum = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) != ' ') sum += (i+1)*((int)s.charAt(i)-64);
            }
            bw.write(sum + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
