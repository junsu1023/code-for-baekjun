import java.io.*;

public class Baekjun_3041 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[][] arr = new char[4][4];
        for(int i=0; i<4; i++){
            String line = br.readLine();
            for(int j=0; j<4; j++){
                arr[i][j] = line.charAt(j);
            }
        }
        int result = 0;
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(arr[i][j] != '.') result += Math.abs(((int)arr[i][j]-65)/4-i) + Math.abs(((int)arr[i][j]-65)%4-j);
            }
        }
        System.out.println(result);
    }
}
