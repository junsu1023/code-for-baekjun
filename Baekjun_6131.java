import java.util.Scanner;

public class Baekjun_6131 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i=1; i<501; i++){
            for(int j=i+1; j<501; j++){
                if(j*j - i*i == n) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
