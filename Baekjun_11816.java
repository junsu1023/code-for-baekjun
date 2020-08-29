import java.io.*;

public class Baekjun_11816 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String n = br.readLine();
        int a = 0;
        if(n.charAt(0) == '0'){
            if(n.charAt(1) == 'x'){
                String change = n.substring(n.lastIndexOf("x") + 1);
                a = Integer.valueOf(change, 16);
            }
            else a = Integer.valueOf(n, 8);
        }
        else a = Integer.parseInt(n);
        bw.write(a + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
