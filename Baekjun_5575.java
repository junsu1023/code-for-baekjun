import java.util.Scanner;

public class Baekjun_5575 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] time = new int[3][6];
        for(int i=0; i<3; i++){
            int h=0, m=0, s=0;
            for(int j=0; j<6; j++){
                time[i][j] = sc.nextInt();
                h = time[i][3] - time[i][0];
                m = time[i][4] - time[i][1];
                s = time[i][5] - time[i][2];
                if(s<0) {
                    s += 60;
                    m--;
                }
                if(m<0){
                    m += 60;
                    h--;
                }
            }
            System.out.println(h + " " + m + " " + s);
        }
    }
}
