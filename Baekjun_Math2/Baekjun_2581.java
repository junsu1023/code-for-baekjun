import java.util.Scanner;

public class Baekjun_2581 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int N = input.nextInt();
        int sum = 0;
        boolean flag;
        int min = N;

        if(M==1) M++;
        for(int i=M; i<=N; i++){
            flag = false;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                sum += i;
                if (i < min)
                    min = i;
            }
        }
        if(sum==0) System.out.println(-1);
        else System.out.println(sum + "\n" + min);
    }
}
