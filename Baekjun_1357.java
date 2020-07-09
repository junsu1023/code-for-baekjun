import java.util.Scanner;

public class Baekjun_1357 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        String n2 = sc.next();
        String temp1 = "";
        String temp2 = "";
        String temp3 = "";
        for(int i=n1.length()-1; i>=0; i--) temp1 += String.valueOf(n1.charAt(i));
        for(int i=n2.length()-1; i>=0; i--) temp2 += String.valueOf(n2.charAt(i));
        int sum = Integer.parseInt(temp1) + Integer.parseInt(temp2);
        String total = String.valueOf(sum);
        for(int i=total.length()-1; i>=0; i--) temp3 += String.valueOf(total.charAt(i));
        System.out.println(Integer.parseInt(temp3));
    }
}
