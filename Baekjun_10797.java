import java.util.Scanner;

public class Baekjun_10797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int[] car = new int[5];
        int count = 0;
        for(int i=0; i<5; i++){
            car[i] = sc.nextInt();
            if(car[i] == day) count++;
        }
        System.out.println(count);
    }
}
