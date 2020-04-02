import java.util.Scanner;

public class Baekjun_1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int M = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();
        int temp = m;
        int cnt = 0;
        boolean check = true;
        for(int i=0; i<n;){
            cnt++;
            if(temp + t <= M) {
                temp += t;
                i++;
            }
            else{
                temp -= r;
                if(temp < m) temp = m;
            }
            if(temp + t > M && temp == m) {
                check = false;
                break;
            }
        }
        if(check) System.out.println(cnt);
        else System.out.println(-1);
    }
}
