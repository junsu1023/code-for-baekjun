import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_2947 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        for(int i=0; i<5; i++) arr[i] = Integer.parseInt(st.nextToken());
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    for (int a:arr) System.out.print(a + " ");
                    System.out.println();
                }
            }
        }
        br.close();
    }
}
