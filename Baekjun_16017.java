import java.util.Scanner;

public class Baekjun_16017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[4];
        for(int i=0; i<4; i++) num[i] = sc.nextInt();
        if((num[0] == 8 || num[0]==9) && (num[1] == num[2]) && (num[3] == 8 || num[3]==9)) System.out.println("ignore");
        else System.out.println("answer");
    }
}
