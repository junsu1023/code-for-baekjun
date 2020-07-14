import java.util.Scanner;

public class Baekjun_1855 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        String[] s = sc.nextLine().split("");
        int len = s.length;
        int a  = len / k;
        for(int i = 0; i < k; i++){
            for(int j = 0; j < a; j++){
                if(j%2==0) System.out.print(s[(j*k)+i]);
                else System.out.print(s[((j+1)*k)-(i+1)]);
            }
        }
    }
}
