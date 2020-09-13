import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjun_17224 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] score = new int[n];
        int total = 0;
        int cnt = 0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int easy = Integer.parseInt(st.nextToken());
            int hard = Integer.parseInt(st.nextToken());
            if(hard <= l) score[i] = 140;
            else if(easy <= l) score[i] = 100;
            else score[i] = 0;
        }
        Arrays.sort(score);
        for(int i=0; i<k; i++){
            total += score[score.length-i-1];
        }
        System.out.println(total);
        br.close();
    }
}
