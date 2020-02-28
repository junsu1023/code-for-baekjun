import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjun_1138 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int[] height = new int[test_case+1];
        for(int tc=1; tc<=test_case; tc++) height[tc] = sc.nextInt();
        for(int i=test_case; i>=1; i--) list.add(height[i], i);
        for(int i:list) System.out.print(i + " ");
    }
}
