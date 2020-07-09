import java.util.Scanner;

public class Baekjun_18228 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] block = new int[n];
        int pos = 0;
        for(int i=0; i<n; i++){
            block[i] = sc.nextInt();
            if(block[i] == -1) pos = i;
        }
        int lmin = 1000000001;
        int rmin = 1000000001;
        for(int i=0; i<pos; i++){
            if(block[i] < lmin) lmin = block[i];
        }
        for(int i=pos+1; i<n; i++){
            if(block[i] < rmin) rmin = block[i];
        }
        long power = lmin + rmin;
        System.out.println(power);
    }
}
