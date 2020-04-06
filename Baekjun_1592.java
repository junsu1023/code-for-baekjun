import java.util.Scanner;

public class Baekjun_1592 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int[] receive = new int[n];
        int cnt = 0;
        int index = 0;
        while(true){
            receive[index]++;
            if(receive[index] == m) break;
            if(receive[index]%2==0){
                if(index + l >= n) index = l - n + index;
                else index += l;
            }
            else{
                if(index - l < 0) index = n - l + index;
                else index -= l;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
