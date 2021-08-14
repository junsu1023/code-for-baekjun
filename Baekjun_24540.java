import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_24540 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mbti = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<4; i++){
            if(mbti.charAt(i)=='I') sb.append("E");
            else if(mbti.charAt(i)=='E') sb.append("I");
            else if(mbti.charAt(i)=='S') sb.append("N");
            else if(mbti.charAt(i)=='N') sb.append("S");
            else if(mbti.charAt(i)=='T') sb.append("F");
            else if(mbti.charAt(i)=='F') sb.append("T");
            else if(mbti.charAt(i)=='J') sb.append("P");
            else if(mbti.charAt(i)=='P') sb.append("J");
        }
        System.out.println(sb.toString());
        br.close();
    }
}
