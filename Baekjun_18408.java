import java.util.Scanner;

public class Baekjun_18408 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[3];
        int count1 = 0;
        int count2 = 0;
        for(int i=0; i<3; i++) {
            n[i] = sc.nextInt();
            if(n[i] == 1) count1++;
            else if(n[i] == 2) count2++;
        }
        if(count1 > count2) System.out.println(1);
        else System.out.println(2);
    }
}
