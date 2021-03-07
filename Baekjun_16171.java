import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_16171 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        String find = br.readLine();
        String[] split = word.split("\\d");
        String str = "";
        for(int i=0; i<split.length; i++){
            if(!split[i].equals("")) str += split[i];
        }
        if(str.contains(find)) System.out.println("1");
        else System.out.println("0");
        br.close();
    }
}
