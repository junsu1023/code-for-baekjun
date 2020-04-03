import java.util.Scanner;

public class Baekjun_1350 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] file = new long[n];
        for(int i=0; i<n; i++) file[i] = sc.nextLong();
        int cluster = sc.nextInt();
        long sum = 0;
        for(int i=0; i<n; i++){
            if(file[i] != 0){
                if(file[i] > cluster){
                    long use = file[i] / cluster;
                    long rest = file[i] % cluster;
                    if(rest!=0) sum += (use+1) * cluster;
                    else sum += use*cluster;
                }
                else sum += cluster;
            }
        }
        System.out.println(sum);
    }
}
