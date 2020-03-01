import java.util.Scanner;

public class Baekjun_5928 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        int d_distance = d - 11;
        int h_distance = h - 11;
        int m_distance = m - 11;

        if(m_distance<0){
            m_distance += 60;
            h_distance-=1;
        }
        if(h_distance<0){
            h_distance += 24;
            d_distance-=1;
        }
        if(d_distance<0) System.out.println(-1);
        else System.out.println(d_distance*1440 + h_distance*60 + m_distance);
    }
}
