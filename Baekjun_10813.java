import java.util.Scanner;

public class Baekjun_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = i+1;
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            a-=1; b-=1;
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        for(int i=0; i<arr.length; i++) System.out.print(arr[i] + " ");
    }
}
