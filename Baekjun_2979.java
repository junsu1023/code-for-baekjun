import java.util.Scanner;

public class Baekjun_2979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] time = new int[101];
        int[] price = new int[4];
        for(int i=1; i<=3; i++){
            price[i] = sc.nextInt();
            price[i] = i * price[i];
        }
        for(int i=0; i<3; i++){
            int arrive = sc.nextInt();
            int leave = sc.nextInt();
            for(int j=arrive; j<leave; j++) time[j]++;
        }
        int total = 0;
        for(int i=0; i<time.length; i++){
            total += price[time[i]];
        }
        System.out.println(total);
    }
}
