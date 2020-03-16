import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_5612 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int investigation = sc.nextInt();
        int[][] car = new int[investigation][2];
        int car_in_tunnel = sc.nextInt();
        int[] cng = new int[investigation];
        for(int i=0; i<investigation; i++){
            for(int j=0; j<2; j++){
                car[i][j] = sc.nextInt();
            }
            cng[i] = car_in_tunnel + car[i][0] - car[i][1];
            car_in_tunnel = cng[i];
        }
        Arrays.sort(cng);
        if(cng[0] < 0) System.out.println(0);
        else System.out.println(cng[investigation-1]);
    }
}
