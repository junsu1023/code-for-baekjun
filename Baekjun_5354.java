import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_5354 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        for(int tc=0; tc<test_case; tc++){
            int n = Integer.parseInt(br.readLine());
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if((i!=0 && i!=n-1) && (j!=0 && j!=n-1)) System.out.print("J");
                    else System.out.print("#");
                }
                System.out.println();
            }
            System.out.println();
        }
        br.close();
    }
}
