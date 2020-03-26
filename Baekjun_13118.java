import java.util.Scanner;

public class Baekjun_13118 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] p = new int[4];
        int[] pos = new int[3];
        int damage = 0;
        for(int i=0; i<4; i++) p[i] = sc.nextInt();
        for(int i=0; i<3; i++) pos[i] = sc.nextInt();
        for(int i=0; i<4; i++){
            if(p[i]==pos[0]) damage = i+1;
        }
        System.out.println(damage);
    }
}
