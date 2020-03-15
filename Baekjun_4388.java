import java.util.Scanner;

public class Baekjun_4388 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            if(n1==0 && n2==0) break;
            int cnt = 0;
            while(n1!=0 && n2!=0){
                int carry = 0;
                int temp = (n1%10 + n2%10)/10;
                if(temp!=0) carry = temp;
                n1 /= 10;
                n2 /= 10;
                if(n1 > n2) n2 += carry;
                else n1 += carry;
                if(carry!=0) cnt++;
            }
            System.out.println(cnt);
        }
    }
}
