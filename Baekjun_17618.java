import java.util.Scanner;

public class Baekjun_17618 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 10;
        if(n <= 10) cnt = n;
        else{
            for(int i=11; i<=n; i++){
                int sum = 0;
                int check = i;
                while(check != 0){
                    sum += check%10;
                    check/=10;
                }
                if(i%sum==0) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
