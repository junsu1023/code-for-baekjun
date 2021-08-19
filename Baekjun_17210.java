import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_17210 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long door = Long.parseLong(br.readLine());
        int method = Integer.parseInt(br.readLine());
        if(door > 5) System.out.println("Love is open door");
        else{
            for(int i=2; i<=door; i++){
                method = (method + 1) % 2;
                System.out.println(method);
            }
        }
        br.close();
    }
}
