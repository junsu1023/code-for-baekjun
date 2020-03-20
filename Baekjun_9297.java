import java.util.Scanner;

public class Baekjun_9297 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int[] num = new int[2];
        for(int tc=0; tc<test_case; tc++){
            for(int i=0; i<2; i++) num[i] = sc.nextInt();
            System.out.print("Case " + (tc+1) + ": ");
            if(num[0]/num[1]==0 && num[0]%num[1]==0) {
                System.out.println(0);
                continue;
            }
            if(num[0] >= num[1]){
                System.out.print(num[0]/num[1] + " ");
                if(num[0]%num[1]!=0) System.out.print(num[0]%num[1] + "/" + num[1]);
                System.out.println();
            }
            else{
                System.out.println(num[0] + "/" + num[1]);
            }
        }
    }
}
