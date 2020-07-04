import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_16944 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        char[] word = s.toCharArray();
        boolean[] check = new boolean[4];
        int need = 0;
        int flag = 0;
        need = 6-word.length;
        for(int i=0; i<word.length; i++){
            if(word[i] >= 'a' && word[i] <= 'z') check[0] = true;
            else if(word[i] >= 'A' && word[i] <='Z') check[1] = true;
            else if(word[i] >= '0' && word[i] <='9') check[2] = true;
            else if(ischeck(word[i])) check[3] = true;
        }
        for(int i=0; i<4; i++){
            if(!check[i]) flag++;
        }
        bw.write((Math.max(need, flag)) + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
    public static boolean ischeck(char c){
        char[] special = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'};
        for(int i=0; i<special.length; i++){
            if(c==special[i]) return true;
        }
        return false;
    }
}
