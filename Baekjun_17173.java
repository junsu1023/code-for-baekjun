import java.util.Scanner;

public class Baekjun_17173 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] temp = new int[n+1];
        for(int i=0; i<m; i++){
            int k = sc.nextInt();
            int j = 1;
            while(true){
                if(k*j<=n) {
                    temp[k*j] = 1;
                    j++;
                }
                else break;
            }
        }
        int total = 0;
        for(int i=0; i<temp.length; i++){
            if(temp[i] != 0) total += i;
        }
        System.out.println(total);
    }
}
