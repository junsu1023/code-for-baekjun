import java.io.*;

public class Baekjun_3943 {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            long num = Long.parseLong(br.readLine());
            long max = num;
            while(num != 1){
                if(num%2==0) num /= 2;
                else num = num*3+1;
                if(max < num) max = num;
            }
            bw.write(max + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
