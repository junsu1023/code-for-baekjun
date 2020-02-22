import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        for(int tc=0; tc<test_case; tc++){
            int num = Integer.parseInt(br.readLine());
            int[][] arr = new int[num+1][2];
            if(num==0) {
                System.out.println("1 0");
                continue;
            }
            if(num==1){
                System.out.println("0 1");
                continue;
            }
            arr[0][0] = 1;
            arr[1][1] = 1;
            for(int i=2; i<=num; i++){
                arr[i][0] = arr[i-1][0] + arr[i-2][0];
                arr[i][1] = arr[i-1][1] + arr[i-2][1];
            }
            System.out.println(arr[num][0] + " " + arr[num][1]);
        }
    }
}
