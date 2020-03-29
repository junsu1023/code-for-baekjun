import java.util.Scanner;

public class Baekjun_15780 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int multitap = sc.nextInt();
        for(int i=0; i<multitap; i++){
            int n = sc.nextInt();
            people -= (n+1)/2;
        }
        if(people <= 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
