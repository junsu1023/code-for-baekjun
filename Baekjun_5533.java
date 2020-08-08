import java.io.*;

public class Baekjun_5533 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][3];
        for(int i=0; i<n; i++){
            String[] s = br.readLine().split(" ");
            for(int j=0; j<3; j++){
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                boolean flag = false;
                for(int k=0; k<n; k++){
                    if(i==k) continue;
                    if(arr[i][j] == arr[k][j]) {
                        arr[k][j] = 0;
                        flag = true;
                    }
                }
                if(flag) arr[i][j] = 0;
            }
        }
        int[] score = new int[n];
        for(int i=0; i<n; i++) score[i] = arr[i][0] + arr[i][1] + arr[i][2];
        for(int i=0; i<n; i++) bw.write(score[i] + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
