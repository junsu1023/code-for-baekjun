import java.util.Scanner;

public class Baekjun_10406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int waist = sc.nextInt();
        int neck = sc.nextInt();
        int punch = sc.nextInt();
        int cnt = 0;
        for(int i=0; i<punch; i++){
            int height = sc.nextInt();
            if(height >= waist && height <=neck) cnt++;
        }
        System.out.println(cnt);
    }
}
