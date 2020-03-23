import java.util.Scanner;

public class Baekjun_10539 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int[] arr = new int[test_case+1];
        int[] res = new int[test_case+1];
        for(int i=1; i<=test_case; i++) arr[i] = sc.nextInt();
        res[1] = arr[1];
        int temp = 0;
        for(int i=2; i<=test_case; i++){
            temp = 0;
            for(int j=1; j<=i; j++){
                temp += res[j];
            }
            res[i] = arr[i]*i-temp;
        }
        for(int i=1; i<=test_case; i++) System.out.print(res[i] + " ");
    }
}
