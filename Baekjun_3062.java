import java.util.Scanner;

public class Baekjun_3062 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            String num = sc.next();
            String back = "";
            String sum = "";
            for(int i=num.length()-1; i>=0; i--) back += num.charAt(i);
            sum = Integer.toString(Integer.parseInt(num) + Integer.parseInt(back));
            String temp = "";
            for(int i=sum.length()-1; i>=0; i--) temp += sum.charAt(i);
            if(sum.equals(temp)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
