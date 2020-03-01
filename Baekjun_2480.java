import java.util.*;

public class Baekjun_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        int money = 0;
        if(x==y && y==z) money = 10000+x*1000;
        else if(x==y || x==z) money = 1000+x*100;
        else if(y==z) money = 1000+y*100;
        else{
            if(x>y && x>z) money = x*100;
            else if(y>x && y>z) money = y*100;
            else if(z>x && z>y) money = z*100;
        }
        System.out.println(money);
    }
}
