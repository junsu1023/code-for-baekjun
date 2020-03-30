import java.util.Scanner;

public class Baekjun_16283 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int sheep = 0;
        int goat = 0;
        int cnt = 0;
        boolean check = false;
        for(int i=1; i<n; i++){
            for(int j=1; j<n; j++){
                if(a*i + b*j == w && i+j==n){
                    check = true;
                    sheep = i;
                    goat = j;
                    cnt++;
                }
                if(cnt>1) check = false;
            }
        }
        if(check) System.out.println(sheep + " " + goat);
        else System.out.println(-1);
    }
}
