import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Baekjun_1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int[][] time = new int[test_case][2];
        for(int tc=0; tc<test_case; tc++){
            time[tc][0] = sc.nextInt();
            time[tc][1] = sc.nextInt();
        }
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]) return Integer.compare(o1[0], o2[0]);
                return Integer.compare(o1[1], o2[1]);
            }
        });
        int count = 0;
        int end = -1;
        for(int i=0; i<test_case; i++){
            if(time[i][0] >= end){
                end = time[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
