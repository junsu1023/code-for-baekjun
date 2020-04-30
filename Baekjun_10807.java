import java.util.Scanner;

public class Baekjun_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++) arr[i] = sc.nextInt();
        int find = sc.nextInt();
        int cnt = 0;
        for(int i=0; i<num; i++){
            if(find == arr[i]) cnt++;
        }
        System.out.println(cnt);
    }
}
