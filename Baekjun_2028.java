import java.util.Scanner;

public class Baekjun_2028 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        boolean check = true;
        for(int tc=0; tc<test_case; tc++){
            String n = sc.next();
            String temp = Integer.toString(Integer.parseInt(n)*Integer.parseInt(n));
            String[] cut = temp.split("", temp.length()-n.length()+1);
            if(n.equals(cut[cut.length-1])) check = true;
            else check = false;
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
