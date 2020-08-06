import java.io.*;
import java.util.Arrays;

public class Baekjun_4641 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            String[] temp = br.readLine().split(" ");
            int cnt = 0;
            if(temp[0].equals("-1")) break;
            int[] n = new int[temp.length-1];
            for(int i=0; i<temp.length-1; i++) n[i] = Integer.parseInt(temp[i]);
            Arrays.sort(n);
            for(int i=0; i<n.length; i++){
                if(Arrays.binarySearch(n, 2*n[i]) > 0) cnt++;
            }
            bw.write(cnt + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
