import java.util.Scanner;

public class Baekjun_11943 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] A = new int[2];
        int[] B = new int[2];
        for(int i=0; i<2; i++) A[i] = sc.nextInt();
        for(int i=0; i<2; i++) B[i] = sc.nextInt();
        int result = (A[0]+B[1] > A[1] + B[0]) ? (A[1] + B[0]) : (A[0] +B[1]);
        System.out.println(result);
    }
}
