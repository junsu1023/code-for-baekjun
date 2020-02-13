import java.util.*;

public class Baekjun_1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] factor = new int[num];
        for(int i=0; i<num; i++) factor[i] = sc.nextInt();
        Arrays.sort(factor);
        System.out.println(factor[0]*factor[num-1]);
    }
}
