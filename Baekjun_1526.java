import java.io.*;

public class Baekjun_1526 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=n; i>=4; i--){
            boolean temp = true;
            int num = i;
            while(num !=0){
                if(num%10==4 || num%10==7){
                    num /= 10;
                }
                else {
                    temp = false;
                    break;
                }
            }
            if(temp) {
                System.out.println(i);
                break;
            }
        }
    }
}
