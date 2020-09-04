import java.io.*;

public class Baekjun_14696 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int tc=0; tc<n; tc++){
            String[] a = br.readLine().split(" ");
            String[] b = br.readLine().split(" ");
            String winner = "";
            int[] a_num = new int[5];
            int[]b_num = new int[5];
            for(int i=1; i<a.length; i++){
                a_num[Integer.parseInt(a[i])]++;
            }
            for(int i=1; i<b.length; i++){
                b_num[Integer.parseInt(b[i])]++;
            }
            for(int i=4; i>=1; i--){
                if(a_num[i] > b_num[i]){
                    winner = "A";
                    break;
                }
                else if(a_num[i] < b_num[i]){
                    winner = "B";
                    break;
                }
                else{
                    if(i==1 && a_num[i] == b_num[i]) winner = "D";
                    continue;
                }
            }
            bw.write(winner + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
