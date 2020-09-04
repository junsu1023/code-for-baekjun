import java.io.*;

public class Baekjun_14623 {
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] b1 = br.readLine().split("");
        String[] b2 = br.readLine().split("");
        long n1 = 0;
        long n2 = 0;
        for(int i=0; i<b1.length; i++) n1 += Integer.parseInt(b1[b1.length-i-1]) * (int)Math.pow(2, i);
        for(int i=0; i<b2.length; i++) n2 += Integer.parseInt(b2[b2.length-i-1]) * (int)Math.pow(2, i);
        long mul = n1*n2;
        StringBuilder sb = new StringBuilder();
        while(mul!=0){
            sb.append(mul%2);
            mul/=2;
        }
        bw.write(sb.reverse().toString() + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
