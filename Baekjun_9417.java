import java.io.*;

public class Baekjun_9417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int tc=0; tc<n; tc++){
            String[] input = br.readLine().split(" ");
            int max_gcd = 0;
            for(int i=0; i<input.length-1; i++){
                for(int j=i+1; j<input.length; j++){
                    int temp = gcd(Integer.parseInt(input[i]), Integer.parseInt(input[j]));
                    if(temp > max_gcd) max_gcd = temp;
                }
            }
            bw.write(max_gcd + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
}
