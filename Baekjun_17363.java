import java.io.*;

public class Baekjun_17363 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] rc = br.readLine().split(" ");
        int row = Integer.parseInt(rc[0]);
        int col = Integer.parseInt(rc[1]);
        char[][] arr = new char[row][col];
        for(int i=0; i<row; i++){
            String in = br.readLine();
            for(int j=0; j<col; j++){
                arr[i][j] = in.charAt(j);
            }
        }
        for(int i=col-1; i>=0; i--){
            for(int j=0; j<row; j++){
                if(arr[j][i] == '|') bw.write("-");
                else if(arr[j][i] == '-') bw.write("|");
                else if(arr[j][i] == '/') bw.write("\\");
                else if(arr[j][i] == '\\') bw.write("/");
                else if(arr[j][i] == '^') bw.write("<");
                else if(arr[j][i] == '<') bw.write("v");
                else if(arr[j][i] == 'v') bw.write(">");
                else if(arr[j][i] == '>') bw.write("^");
                else bw.write(arr[j][i]);
            }
            bw.write("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
