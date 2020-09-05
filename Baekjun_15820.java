import java.io.*;

public class Baekjun_15820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int s1 = Integer.parseInt(s[0]);
        int s2 = Integer.parseInt(s[1]);
        boolean sample_check = true;
        boolean system_check = true;
        for(int i=0; i<s1; i++){
            String[] ans = br.readLine().split(" ");
            int tans = Integer.parseInt(ans[0]);
            int mans = Integer.parseInt(ans[1]);
            if(tans != mans) sample_check = false;
        }
        for(int i=0; i<s2; i++){
            String[] ans = br.readLine().split(" ");
            int tans = Integer.parseInt(ans[0]);
            int mans = Integer.parseInt(ans[1]);
            if(tans != mans) system_check = false;
        }
        if(sample_check && system_check) bw.write("Accepted");
        else if(!sample_check) bw.write("Wrong Answer");
        else if(!system_check) bw.write("Why Wrong!!!");
        bw.flush();
        br.close();
        bw.close();
    }
}
