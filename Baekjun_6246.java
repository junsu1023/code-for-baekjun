import java.io.*;

public class Baekjun_6246 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int q = Integer.parseInt(s[1]);
        int[] arr = new int[10001];
        int cnt = 0;
        for(int i=0; i<q; i++){
            String[] input = br.readLine().split(" ");
            int L = Integer.parseInt(input[0]);
            int l = Integer.parseInt(input[1]);
            int index = L;
            while(index <= n){
                if(arr[index] == 0){
                    arr[index] = 1;
                    cnt++;
                }
                index = index + l;
            }
        }
        bw.write(n-cnt + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
