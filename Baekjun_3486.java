import java.io.*;

public class Baekjun_3486 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test_case = Integer.parseInt(br.readLine());
        for(int tc=0; tc<test_case; tc++){
            String[] in = br.readLine().split(" ");
            String[] a = in[0].split("");
            String[] b = in[1].split("");
            int n1 = 0, n2 = 0;
            for(int i=0; i<a.length; i++) n1 += (Integer.parseInt(a[i])*(int)Math.pow(10, i));
            for(int i=0; i<b.length; i++) n2 += (Integer.parseInt(b[i])*(int)Math.pow(10, i));
            int sum = n1 + n2;
            String[] s = Integer.toString(sum).split("");
            int ans = 0;
            for(int i=0; i<s.length; i++) ans += (Integer.parseInt(s[i])*(int)Math.pow(10, i));
            bw.write(ans + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
