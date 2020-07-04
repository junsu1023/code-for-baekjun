import java.util.Scanner;

public class Baekjun_17273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] front = new int[n];
        int[] back = new int[n];
        long total = 0;
        for(int i=0; i<n; i++){
            front[i] = sc.nextInt();
            back[i] = sc.nextInt();
        }
        int[] comment = new int[m];
        for(int i=0; i<m; i++){
            comment[i] = sc.nextInt();
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(front[j] <= comment[i]){
                    int temp = front[j];
                    front[j] = back[j];
                    back[j] = temp;
                }
            }
        }
        for(int i=0; i<front.length; i++){
            total += front[i];
        }
        System.out.println(total);
    }
}
