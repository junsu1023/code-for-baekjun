import java.util.Scanner;

public class Baekjun_9950{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            int result = 0;
            if(n1==0 && n2==0 && n3==0) break;
            if(n1==0) {
                result = (int)Math.sqrt((double)(n3*n3)/(n2*n2));
                System.out.println(result + " " + n2 + " " + n3);
            }
            else if(n2==0) {
                result = (int)Math.sqrt((double)(n3*n3)/(n1*n1));
                System.out.println(n1 + " " + result + " " + n3);
            }
            else if(n3==0) {
                result = (int)Math.sqrt((n1*n1)*(n2*n2));
                System.out.println(n1 + " " + n2 + " " + result);
            }
        }
    }
}
