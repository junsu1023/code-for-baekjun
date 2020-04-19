import java.util.Scanner;

public class Baekjun_5026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        sc.nextLine();
        for(int tc=0; tc<test_case; tc++){
            String cal = sc.nextLine();
            if(cal.equals("P=NP")) System.out.println("skipped");
            else{
                String[] temp = cal.split("\\+");
                int a = Integer.parseInt(temp[0]);
                int b = Integer.parseInt(temp[1]);
                System.out.println(a+b);
            }
        }
    }
}
