import java.util.Scanner;

public class Baekjun_1978 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int result=0;
        boolean flag;

        for(int i=0; i<num; i++){
            int n = input.nextInt();
            flag = false;
            for(int j=2; j<n; j++){
                if(n%j==0) {
                    flag = true;
                    break;
                }
            }
            if(!flag && n > 1)
                result++;
        }
        System.out.println(result);
    }
}
