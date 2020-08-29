import java.io.*;

public class Baekjun_10219 {
    public static void main(String []args) throws IOException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test_case = Integer.parseInt(br.readLine());
        for(int tc=0; tc<test_case; tc++){
            String[] hw = br.readLine().split(" ");
            int h = Integer.parseInt(hw[0]);
            int w = Integer.parseInt(hw[1]);
            String[][] arr = new String[h][w];
            for(int i=0; i<h; i++){
                String[] in = br.readLine().split("");
                for(int j=0; j<w; j++){
                    arr[i][j] = in[j];
                }
            }
            for(int i=0; i<h; i++){
                for(int j=w-1; j>=0; j--){
                    bw.write(arr[i][j]);
                }
                bw.write("\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
