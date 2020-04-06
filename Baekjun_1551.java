import java.util.Scanner;

public class Baekjun_1551 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String[] arr = sc.next().split(",");
        int[] copy = new int[21];
        for(int i=0; i<n; i++) copy[i] = Integer.parseInt(arr[i]);

        for(int i=0; i<k; i++){
            for(int j=0; j<n-i-1; j++){
                copy[j] = copy[j+1] - copy[j];
            }
        }

        for(int i=0; i<n-k; i++){
            System.out.print(copy[i]);
            if(i==n-k-1) break;
            System.out.print(",");
        }
    }
}
