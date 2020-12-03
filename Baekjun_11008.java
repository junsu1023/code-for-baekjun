import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_11008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String origin = st.nextToken();
            String copy = st.nextToken();
            int ans = origin.length();
            int pos = 0;
            while(pos < origin.length()-copy.length()+1){
                if(origin.charAt(pos)==copy.charAt(0)){
                    boolean check = true;
                    for(int j=0; j<copy.length(); j++){
                        if(origin.charAt(pos+j)!=copy.charAt(j)){
                            check = false;
                            break;
                        }
                    }
                    if(check){
                        pos += copy.length();
                        ans -= copy.length()-1;
                        continue;
                    }
                }
                pos++;
            }
            System.out.println(ans);
        }
        br.close();
    }

}
