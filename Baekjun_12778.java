import java.io.*;

public class Baekjun_12778 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test_case = Integer.parseInt(br.readLine());
        for(int tc=0; tc<test_case; tc++){
            String[] in = br.readLine().split(" ");
            int n = Integer.parseInt(in[0]);
            String cn = in[1];
            if(cn.equals("C")){
                String[] s = br.readLine().split(" ");
                for(int i=0; i<s.length; i++){
                    System.out.print((int)(s[i].charAt(0))-64 + " ");
                }
            }
            else{
                String[] s = br.readLine().split(" ");
                for(int i=0; i<s.length; i++){
                    System.out.print((char)(Integer.parseInt(s[i])+ 64) + " ");
                }
            }
            System.out.println();
        }
    }
}
