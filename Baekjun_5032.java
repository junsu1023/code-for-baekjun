import java.util.Scanner;

public class Baekjun_5032 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int f = sc.nextInt();
        int c = sc.nextInt();
        int bottle = e+f;
        int cnt = 0;
        while(true){
            if(bottle >= c){
                bottle -= (c-1);
                cnt++;
            }
            if(bottle < c) break;
        }
        System.out.println(cnt);
    }
}
