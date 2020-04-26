import java.util.Scanner;

public class Baekjun_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        sc.nextLine();
        for(int tc=0; tc<test_case; tc++){
            String line = sc.nextLine();
            if(line.length()==1) System.out.println(line+line);
            else if(line.length()==2) System.out.println(line);
            else System.out.println(line.charAt(0) + "" + line.charAt(line.length()-1));
        }
    }
}
