import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_16433 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        if((r+c)%2==0){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if((i+j+2)%2==0) System.out.print("v");
                    else System.out.print(".");
                }
                System.out.println();
            }
        }
        else{
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if((i+j+2)%2==0) System.out.print(".");
                    else System.out.print("v");
                }
                System.out.println();
            }
        }
        br.close();
    }
}
