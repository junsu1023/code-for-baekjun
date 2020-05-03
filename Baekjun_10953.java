import java.util.Scanner;

public class Baekjun_10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            String[] cal = sc.nextLine().split(",");
            System.out.println(Integer.parseInt(cal[0])+Integer.parseInt(cal[1]));
        }
    }
}
