import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjun_2204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;
            String[] arr = new String[n];
            for(int i=0; i<n; i++) arr[i] = br.readLine();
            String[] small = new String[n];
            for(int i=0; i<n; i++) small[i] = arr[i].toLowerCase();
            String first = "";
            Arrays.sort(small);
            for(int i=0; i<n; i++){
                if(small[0].equals(arr[i].toLowerCase())){
                    first = arr[i];
                    break;
                }
            }
            System.out.println(first);
        }
        br.close();
    }
}
