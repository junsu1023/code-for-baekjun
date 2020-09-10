import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Baekjun_2816 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int channel = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList();
        int idx1 = 0;
        int idx2 = 0;
        for(int i=0; i<channel; i++){
            list.add(br.readLine());
            if(list.get(i).equals("KBS1")) idx1 = i;
            if(list.get(i).equals("KBS2")) idx2 = i;
        }
        if(idx1 > idx2) idx2++;
        for(int i=0; i<idx1; i++){
            if(idx1 != 0) sb.append("1");
        }
        for(int i = idx1-1; i>=0; i--){
            if(idx1 != 0) sb.append("4");
        }
        for(int i=0; i<idx2; i++){
            if(idx2 != 1) sb.append("1");
        }
        for(int i = idx2-1; i>=1; i--){
            if(idx2 != 1) sb.append("4");
        }
        System.out.println(sb.toString());
        br.close();
    }
}
