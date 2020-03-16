import java.util.Scanner;

public class Baekjun_5692 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String num = sc.next();
            String n = new StringBuffer(num).reverse().toString();
            String[] number = n.split("");
            if(num.charAt(0) == '0') break;
            int result = 0;
            for(int i=number.length-1; i>=0; i--){
                result += Integer.parseInt(number[i])*(fac(i+1));
            }
            System.out.println(result);
        }
    }

    public static int fac(int a){
        int f = 1;
        for(int i=a; i>=1; i--) f*=i;
        return f;
    }
}
