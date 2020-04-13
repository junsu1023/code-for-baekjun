import java.util.Scanner;

public class Baekjun_2846 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int[] height = new int[n];
        int result = 0;
        for(int i=0; i<n; i++) height[i] = sc.nextInt();
        for(int i=0; i<n; i++){
            int start = height[i];
            int difference = 0;
            for(int j=i+1; j<n; j++){
                if(start < height[j] && height[j-1] < height[j])
                    difference = height[j] - start;
                else break;
            }
            result = Math.max(result, difference);
        }
        System.out.println(result);
    }
}
