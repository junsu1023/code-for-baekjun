import java.util.Scanner;

public class Baekjun_17263 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int max = 0;
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
            if(num[i] > max) max = num[i];
        }
        System.out.println(max);
    }
}
