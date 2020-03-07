import java.util.Scanner;

public class Baekjun_1547 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int change = sc.nextInt();
        int[] cup = new int[4];
        cup[1] = 1;
        for(int i=0; i<change; i++){
            int loc1 = sc.nextInt();
            int loc2 = sc.nextInt();
            int temp = cup[loc1];
            cup[loc1] = cup[loc2];
            cup[loc2] = temp;
        }
        for(int i=1; i<=3; i++){
            if(cup[i] == 1) System.out.println(i);
        }
    }
}
