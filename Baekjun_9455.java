import java.io.*;

public class Baekjun_9455 {
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int tc=0; tc<n; tc++){
            int[][] arr = new int[101][101];
            String[] RC = br.readLine().split(" ");
            int row = Integer.parseInt(RC[0]);
            int col = Integer.parseInt(RC[1]);
            for(int i=0; i<row; i++){
                String[] input = br.readLine().split(" ");
                for(int j=0; j<col; j++){
                    arr[i][j] = Integer.parseInt(input[j]);
                }

            }
            int total = 0;
            for(int j=0; j<col; j++){
                for(int i=row-1; i>=0; i--){
                    int cnt = 0;
                    if(arr[i][j] == 1){
                        for(int k=i+1; k<row; k++){
                            if(arr[k][j] == 1) break;
                            else cnt++;
                        }
                        total += cnt;
                        int idx = arr[i+cnt][j];
                        arr[i+cnt][j] = arr[i][j];
                        arr[i][j] = idx;
                    }
                }
            }
            bw.write(total + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
