import java.io.*;

public class Baekjun_15726 {
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] in = br.readLine().split(" ");
        double case1 = Double.parseDouble(in[0]) * Double.parseDouble(in[1]) / Double.parseDouble(in[2]);
        double case2 = Double.parseDouble(in[0]) / Integer.parseInt(in[1]) * Integer.parseInt(in[2]);
        double max = Math.floor(Math.max(case1, case2));
        bw.write((int)max + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
