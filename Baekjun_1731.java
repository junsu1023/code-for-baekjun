import java.util.Scanner;

public class Baekjun_1731 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        int q = 0;
        boolean method = true;
        if(arr[1]-arr[0] == arr[2]-arr[1]) q = arr[1]-arr[0];
        else if((arr[1]/arr[0] == arr[2]/arr[1]) && (arr[1]%arr[0]==0 && arr[2]%arr[1]==0)){
            q = arr[1]/arr[0];
            method = false;
        }
        if(method) System.out.println(arr[n-1]+q);
        else System.out.println(arr[n-1]*q);
    }
}
