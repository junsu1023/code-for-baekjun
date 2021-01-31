import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int bitSet = 0;
        while(n --> 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int num;
            switch (command){
                case "add":
                    num = Integer.parseInt(st.nextToken());
                    bitSet |= (1<<(num-1));
                    break;
                case "remove":
                    num = Integer.parseInt(st.nextToken());
                    bitSet = bitSet & ~(1<<(num-1));
                    break;
                case "check":
                    num = Integer.parseInt(st.nextToken());
                    sb.append((bitSet & (1<<(num-1))) != 0 ? "1\n" : "0\n");
                    break;
                case "toggle":
                    num = Integer.parseInt(st.nextToken());
                    bitSet ^= (1<<(num-1));
                    break;
                case "all":
                    bitSet |= (~0);
                    break;
                case "empty":
                    bitSet &= 0;
                    break;
            }
        }
        System.out.println(sb.toString());
        br.close();
    }
}
