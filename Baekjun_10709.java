import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_10709 {
    public static int height;
    public static int weight;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        height = Integer.parseInt(st.nextToken());
        weight = Integer.parseInt(st.nextToken());
        char[][] joi = new char[height][weight];
        for(int i=0; i<height; i++){
            String arr = br.readLine();
            for(int j=0; j<weight; j++){
                joi[i][j] = arr.charAt(j);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<height; i++){
            int cnt = 1;
            boolean isCloud = false;
            for(int j=0; j<weight; j++){
                if(joi[i][j] == 'c'){
                    sb.append("0 ");
                    cnt = 1;
                    isCloud = true;
                    continue;
                }
                if(isCloud){
                    if(joi[i][j] == '.'){
                        sb.append(cnt).append(" ");
                        cnt++;
                    }
                }
                else{
                    sb.append("-1 ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
        br.close();
    }
}
