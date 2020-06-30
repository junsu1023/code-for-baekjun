import java.util.Scanner;

public class Baekjun_16396 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[10001];
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j=x+1; j<=y; j++){
                arr[j] = 1;
            }
        }
        int total = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1) total++;
        }
        System.out.println(total);
    }
}
