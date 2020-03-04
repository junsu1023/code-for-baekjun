import java.util.Scanner;

public class Baekjun_16431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] b_pos = new int[2];
        int[] d_pos = new int[2];
        int[] j_pos = new int[2];
        for(int i=0; i<2; i++) b_pos[i] = sc.nextInt();
        for(int i=0; i<2; i++) d_pos[i] = sc.nextInt();
        for(int i=0; i<2; i++) j_pos[i] = sc.nextInt();
        int brow = Math.abs(j_pos[0]-b_pos[0]);
        int bcol = Math.abs(j_pos[1] - b_pos[1]);
        int drow = Math.abs(j_pos[0]-d_pos[0]);
        int dcol = Math.abs(j_pos[1]-d_pos[1]);
        int b_distance = Math.max(brow, bcol);
        int d_distance = drow + dcol;
        if(b_distance > d_distance) System.out.println("daisy");
        else if(b_distance < d_distance) System.out.println("bessie");
        else System.out.println("tie");
    }
}
