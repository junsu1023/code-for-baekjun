import java.util.Scanner;

public class Baekjun_2399 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long sum = 0;
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                sum += 2 * Math.abs(arr[i]-arr[j]);
            }
        }
        System.out.println(sum);
    }
}
