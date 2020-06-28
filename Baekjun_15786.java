import java.util.Scanner;

public class Baekjun_15786 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        for(int i=0; i<m; i++){
            String check = "false";
            String temp = sc.nextLine();
            int cnt = 0;
            for(int j=0; j<temp.length(); j++) {
                if (temp.charAt(j) == s.charAt(cnt)) cnt++;
                if(cnt==n) {
                    check = "true";
                    break;
                }
            }
            System.out.println(check);
        }
    }
}
