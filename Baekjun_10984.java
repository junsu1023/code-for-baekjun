import java.util.Scanner;

public class Baekjun_10984 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int n = sc.nextInt();
            double sum = 0;
            double total_grade = 0;
            double total_score = 0;
            for(int i=0; i<n; i++){
                double grade = sc.nextInt();
                double score = sc.nextDouble();
                total_grade += grade;
                sum += grade*score;
            }
            total_score = sum / total_grade;
            System.out.println(String.format("%.0f %.1f", total_grade, total_score));
        }
    }
}
