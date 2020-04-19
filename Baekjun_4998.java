import java.util.Scanner;

public class Baekjun_4998 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            double n = sc.nextDouble();
            double b = sc.nextDouble();
            double m = sc.nextDouble();
            int cnt = 0;
            while(n < m){
                n += n*(b/100);
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}
