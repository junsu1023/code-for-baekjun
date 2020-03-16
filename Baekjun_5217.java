import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_5217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        int comma = 0;
        for(int tc=0; tc<test_case/2+1; tc++) {
            int n = Integer.parseInt(br.readLine());
            String temp = "Pairs for";
            System.out.print(temp + " " + n + ":");
            for (int i = 1; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    if (i + j == n && comma == 0) {
                        System.out.print(" " + i + " " + j);
                        comma = 1;
                    }
                    else if(i + j == n && comma == 1){
                        System.out.print(", " + i + " " + j);
                        comma = 1;
                    }
                }
            }
            comma = 0;
            System.out.println();
        }
    }
}
