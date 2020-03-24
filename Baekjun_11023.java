import java.util.Scanner;

public class Baekjun_11023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] num = sc.nextLine().split(" ");
        int sum = 0;
        for(int i=0; i<num.length; i++){
            sum += Integer.parseInt(num[i]);
        }
        System.out.println(sum);
    }
}
