import java.io.*;

public class Baekjun_16674 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int z_cnt = 0;
        int o_cnt = 0;
        int t_cnt = 0;
        int e_cnt = 0;
        int temp = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0') z_cnt++;
            else if(s.charAt(i)=='1') o_cnt++;
            else if(s.charAt(i)=='2') t_cnt++;
            else if(s.charAt(i)=='8') e_cnt++;
            else temp++;
        }
        if(temp==0 && (z_cnt==o_cnt && o_cnt==t_cnt && t_cnt==e_cnt)) bw.write("8\n");
        else if(temp==0 && (z_cnt>0 && o_cnt>0 && t_cnt>0 && e_cnt>0)) bw.write("2\n");
        else if(temp==0 && (z_cnt>0 || o_cnt>0 || t_cnt>0 || e_cnt>0)) bw.write("1\n");
        else bw.write("0\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
