import java.io.*;

public class Baekjun_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int [] input = new int[10001];
        for(int i=0; i<num; i++)
            input[Integer.parseInt(br.readLine())]++;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=1; i<10001; i++){
            while(0 < input[i]--){
                bw.write(Integer.toString(i) + "\n");
            }
        }
        br.close();
        bw.close();
    }
}