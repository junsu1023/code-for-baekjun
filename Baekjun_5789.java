import java.util.Scanner;

public class Baekjun_5789 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        sc.nextLine();
        for(int tc=0; tc<test_case; tc++){
            String n = sc.nextLine();
            if(n.charAt(n.length()/2-1) == n.charAt(n.length()/2)) System.out.println("Do-it");
            else System.out.println("Do-it-Not");
        }
    }
}
