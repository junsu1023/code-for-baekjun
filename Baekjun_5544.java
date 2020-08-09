import java.io.*;

public class Baekjun_5544 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] teams = new int[n+1];
        int num = n*(n-1)/2;
        for(int i=0; i<num; i++){
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int ascore = Integer.parseInt(s[2]);
            int bscore = Integer.parseInt(s[3]);
            if(ascore > bscore) teams[a] += 3;
            else if(ascore < bscore) teams[b] += 3;
            else{
                teams[a] += 1;
                teams[b] += 1;
            }
        }
        int[] score = new int[teams.length];
        for(int i=1; i<teams.length; i++){
            int max = -9999;
            int index = 0;
            for(int j=1; j<teams.length; j++){
                if(score[j]==0 && teams[j] > max){
                    max = teams[j];
                    index = j;
                }
            }
            score[index] = i;
            for(int j=index+1; j<teams.length; j++){
                if(teams[j] == teams[index]){
                    score[j] = score[index];
                    i++;
                }
            }
        }
        for(int i=1; i<teams.length; i++) bw.write(score[i] + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
