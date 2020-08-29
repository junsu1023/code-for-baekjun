import java.io.*;

public class Baekjun_10769 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int happy = 0;
        int sad = 0;
        for(int i=0; i<s.length()-2; i++){
            String word = s.substring(i, i+3);
            if(word.equals(":-)")) happy++;
            else if(word.equals(":-(")) sad++;
        }
        if(happy==0 && sad==0) bw.write("none");
        else{
            if(happy == sad) bw.write("unsure");
            else if(happy > sad) bw.write("happy");
            else bw.write("sad");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
