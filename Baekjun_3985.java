import java.io.*;

public class Baekjun_3985 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int piece = Integer.parseInt(br.readLine());
        int[] cake = new int[1001];
        int n = Integer.parseInt(br.readLine());
        int[] eat = new int[1001];
        for(int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");
            int start = Integer.parseInt(input[0]);
            int end =  Integer.parseInt(input[1]);
            eat[i] = end - start + 1;
            for(int j=start; j<=end; j++){
                if(cake[j] == 0) cake[j] = i+1;
            }
        }
        int tempMax = 0;
        int pos1 = 0;
        for(int i=0; i<n; i++){
            if(tempMax < eat[i]){
                tempMax = eat[i];
                pos1 = i+1;
            }
        }
        int max = 0;
        int pos2 = 0;
        int[] cnt = new int[piece];
        for(int i=0; i<n; i++){
            for(int j=0; j<piece; j++){
                if(cake[j] == i+1) cnt[i]++;
            }
        }
        for(int i=0; i<piece; i++){
            if(max < cnt[i]){
                max = cnt[i];
                pos2 = i+1;
            }
        }
        bw.write(pos1 + "\n" + pos2 + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
