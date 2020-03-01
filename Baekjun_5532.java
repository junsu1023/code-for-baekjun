import java.util.Scanner;

public class Baekjun_5532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vacation = sc.nextInt();
        int korean = sc.nextInt();
        int math = sc.nextInt();
        int max_korean = sc.nextInt();
        int max_math = sc.nextInt();
        int check_Korean = korean / max_korean;
        int check_Math = math / max_math;
        if(korean % max_korean != 0) check_Korean++;
        if(math % max_math != 0) check_Math++;
        int study = Math.max(check_Korean, check_Math);
        System.out.println(vacation - study);
    }
}
