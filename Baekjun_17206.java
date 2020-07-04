import java.util.Scanner;

public class Baekjun_17206 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] n = new int[t];
        for(int i=0; i<t; i++){
            n[i] = sc.nextInt();
        }
        long temp = 0;
        long[] thr = new long[80001];
        long[] sev = new long[80001];
        for(int i=0; i<thr.length; i++){
            if(i%3==0) temp += i;
            thr[i] = temp;
        }
        temp = 0;
        for(int i=0; i<sev.length; i++){
            if(i%7==0){
                if(i%3!=0) temp += i;
            }
            sev[i] = temp;
        }
        for(int i=0; i<t; i++){
            long sum = thr[n[i]] + sev[n[i]];
            System.out.println(sum);
        }
    }
}
