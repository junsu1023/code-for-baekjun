import java.util.Scanner;

public class Baekjun_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int mul = num1 * num2 * num3;
        int[] cnt = new int[10];
        while(mul > 0){
            switch (mul%10){
                case 0:
                    cnt[0]++;
                    break;
                case 1:
                    cnt[1]++;
                    break;
                case 2:
                    cnt[2]++;
                    break;
                case 3:
                    cnt[3]++;
                    break;
                case 4:
                    cnt[4]++;
                    break;
                case 5:
                    cnt[5]++;
                    break;
                case 6:
                    cnt[6]++;
                    break;
                case 7:
                    cnt[7]++;
                    break;
                case 8:
                    cnt[8]++;
                    break;
                case 9:
                    cnt[9]++;
                    break;
            }
            mul/=10;
        }
        int i=0;
        while(i<10) {
            System.out.println(cnt[i]);
            i++;
        }
    }
}
