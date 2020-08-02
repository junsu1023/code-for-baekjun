import java.io.*;

public class Baekjun_3035 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input  = br.readLine().split(" ");
        int r = Integer.parseInt(input[0]);
        int c = Integer.parseInt(input[1]);
        int zr = Integer.parseInt(input[2]);
        int zc = Integer.parseInt(input[3]);
        char[][] arr = new char[51][51];
        for(int i=0; i<r; i++){
            String line = br.readLine();
            for(int j=0; j<c; j++){
                arr[i][j] = line.charAt(j);
            }
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<zr; j++){
                for(int k=0; k<c; k++){
                    for(int l=0; l<zc; l++){
                        bw.write(arr[i][k]);
                    }
                }
                bw.write("\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
