import java.util.Scanner;

public class Baekjun_1333 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int d = sc.nextInt();
        int ans = 0;
        for(int i=0; i<n; i++) {
            for(int j=(i*(l+5)+l); j<(i+1)*(l+5); j++){
                if(j%d==0){
                    ans = j;
                    break;
                }
            }
            if(ans != 0) break;
        }
        if(ans == 0)
            System.out.println(n*(l+5)-5+d-(n*(l+5)-5)%d);
        else
            System.out.println(ans);
    }
}
