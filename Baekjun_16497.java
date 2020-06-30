import java.util.Scanner;

public class Baekjun_16497 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bo = new int[n];
        int[] re = new int[n];
        int[] day = new int[32];
        for(int i=0; i<n; i++){
            bo[i] = sc.nextInt();
            re[i] = sc.nextInt();
            day[bo[i]]--;
            day[re[i]]++;
        }
        int book = sc.nextInt();
        boolean check = true;
        for(int i=0; i<day.length; i++){
            book += day[i];
            if(book < 0) {
                check = false;
                break;
            }
        }
        if(check) System.out.println(1);
        else System.out.println(0);
    }
}