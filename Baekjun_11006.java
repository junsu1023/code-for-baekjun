import java.util.Scanner;

public class Baekjun_11006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int legs = sc.nextInt();
            int chicken = sc.nextInt();
            int normal = legs - chicken;
            int lesion = chicken - normal;
            System.out.println(lesion + " " + normal);
        }
    }
}
