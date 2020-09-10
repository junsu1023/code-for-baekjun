import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_17294 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] n = br.readLine().split("");
        int d = Integer.parseInt(n[0]) - Integer.parseInt(n[1]);
        boolean check = true;
        for(int i=1; i<n.length-1; i++){
            if(Integer.parseInt(n[i]) - Integer.parseInt(n[i+1]) != d){
                check = false;
                break;
            }
            d = Integer.parseInt(n[i]) - Integer.parseInt(n[i+1]);
        }
        if(check) System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
        else System.out.println("흥칫뿡!! <(￣ ﹌ ￣)>");
        br.close();
    }
}
