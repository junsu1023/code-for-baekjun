import java.util.Scanner;

public class Baekjun_2511 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int sum1 = 0;
        int sum2 = 0;
        String result = "";
        for(int i=0; i<10; i++) A[i] = sc.nextInt();
        for(int i=0; i<10; i++) B[i] = sc.nextInt();
        for(int i=0; i<10; i++) {
            if(A[i] > B[i]) sum1 += 3;
            else if(A[i] < B[i]) sum2 += 3;
            else {
                sum1 += 1;
                sum2 += 1;
            }
        }
        if(sum1 > sum2) result = "A";
        else if(sum1 < sum2) result = "B";
        else {
            boolean check = true;
            for(int i=9; i>=0; i--){
                if(A[i] > B[i]) {
                    result = "A";
                    check = false;
                    break;
                }
                else if(A[i] < B[i]){
                    result = "B";
                    check = false;
                    break;
                }
            }
            if(check) result = "D";
        }
        System.out.println(sum1 + " " + sum2);
        System.out.print(result);
    }
}
