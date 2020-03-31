import java.util.Scanner;

public class Baekjun_16503 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k1 = sc.nextInt();
        String op1 = sc.next();
        int k2 = sc.nextInt();
        String op2 = sc.next();
        int k3 = sc.nextInt();
        int get1 = cal(op1, k1, cal(op2, k2, k3));
        int get2 = cal(op2, cal(op1, k1, k2), k3);
        System.out.println(Math.min(get1, get2));
        System.out.println(Math.max(get1, get2));
    }
    public static int cal(String op, int a, int b){
        int check = 1;
        if(a<0 || b<0) check= -1;
        switch(op){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return Math.abs(a)/Math.abs(b) * check;
        }
        return 0;
    }
}
