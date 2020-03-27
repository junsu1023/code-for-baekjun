import java.util.Scanner;

public class Baekjun_14568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i=2; i<n; i+=2){
            for(int j=1; j<n; j++){
                for(int k=j+2; k<n; k++){
                    if(i+j+k==n) cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
