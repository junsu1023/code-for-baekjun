import java.util.Scanner;

public class Baekjun_14723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        int temp = 0;
        for(int i=1; i<=n; i++){
            if(i*(i+1)/2 >= n){
                num = i;
                break;
            }
        }
        temp = n - num * (num-1) / 2;
        System.out.println(num - temp + 1 + " " + temp);
    }
}
