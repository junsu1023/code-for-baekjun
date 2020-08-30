import java.util.Scanner;

public class Baekjun_1236 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();	
        	
        char[][] map = new char[N][M];
        for(int i=0; i<map.length; i++) {
            String str = scan.next();
            for(int j=0; j<map[i].length; j++) {
                map[i][j] = str.charAt(j);
            }
        }
        int r_cnt = 0;
        int c_cnt = 0;
        for(int i=0; i<N; i++) {
            boolean flag = true;
            for(int j=0; j<M; j++) {
                if(map[i][j] == 'X') {
                    flag = false;
                    break;
                }
            }
            if(flag)
                r_cnt ++;
        }
        for(int i=0; i<M; i++) {
            boolean flag = true;
            for(int j=0; j<N; j++) {
                if(map[j][i] == 'X') {
                    flag = false;
                    break;
                }
            }
            if(flag)
                c_cnt ++;
        }
        System.out.println(Math.max(r_cnt, c_cnt));
        scan.close();
    }
}
