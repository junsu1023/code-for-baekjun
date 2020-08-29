import java.io.*;

public class Baekjun_1252 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] in = br.readLine().split(" ");
        String b1 = in[0];
        String b2 = in[1];
        if(b1.length() < b2.length()){
            String temp = b1;
            b1 = b2;
            b2 = temp;
        }
        int diff = b1.length() - b2.length();
        while(diff-->0){
            b2 = "0" + b2;
        }
        char[] a = b1.toCharArray();
        char[] b = b2.toCharArray();
        int round = 0;
        String result = "";
        for(int i=a.length-1; i>=0; i--){
            int sum = (a[i] - '0') + (b[i] - '0') + round;
            if(sum == 3){
                result = 1 + result;
                round = 1;
            }
            else if(sum == 2){
                result = 0 + result;
                round = 1;
            }
            else if(sum == 1){
                result = 1 + result;
                round = 0;
            }
            else{
                result = 0 + result;
                round = 0;
            }
        }
        result = round==1? round+result : result;
        String ans = "";
        boolean flag = true;
        for(int i=0; i<result.length(); i++){
            if(result.charAt(i)=='1') flag = false;
            if(flag) continue;
            ans += result.charAt(i);
        }
        bw.write(ans.equals("") ? "0" : ans + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
