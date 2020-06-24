import java.util.Scanner;

public class Baekjun_14697 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] r = new int[3];
        for(int i=0; i<3; i++) r[i] = sc.nextInt();
        int total = sc.nextInt();
        boolean check = false;
        for(int i=0; i<=50; i++){
            for(int j=0; j<=50; j++){
                for(int k=0; k<=50; k++){
                    if(r[0]*i + r[1]*j + r[2]*k == total) check = true;
                }
            }
        }
        if(check) System.out.println(1);
        else System.out.println(0);
    }
}
