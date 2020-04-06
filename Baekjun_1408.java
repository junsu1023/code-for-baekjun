import java.util.Scanner;

public class Baekjun_1408 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String[] now = sc.nextLine().split(":");
        String[] start = sc.nextLine().split(":");
        int n_total = Integer.parseInt(now[0])*3600 + Integer.parseInt(now[1])*60 + Integer.parseInt(now[2]);
        int s_total = Integer.parseInt(start[0])*3600 + Integer.parseInt(start[1])*60 +Integer.parseInt(start[2]);
        if(n_total > s_total) s_total += 86400;
        int runtime = s_total - n_total;
        int h = runtime/3600;
        int m = runtime%3600/60;
        int s = runtime%3600%60;
        System.out.printf("%02d:%02d:%02d", h, m ,s);
    }
}
