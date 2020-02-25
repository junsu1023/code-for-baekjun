import java.util.Scanner;

public class Baekjun_1057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int game = sc.nextInt();
        int j_num = sc.nextInt();
        int h_num = sc.nextInt();
        int count = 0;
        while(j_num != h_num){
            j_num = j_num/2 + j_num%2;
            h_num = h_num/2 + h_num%2;
            count++;
        }
        System.out.println(count);
    }
}
