import java.util.Scanner;

public class Baekjun_1392 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] num = new int[n];
        int[] question = new int[q];
        for(int i=0; i<n; i++) num[i] = sc.nextInt();
        for(int i=0; i<q; i++) question[i] = sc.nextInt();
        for(int i=0; i<q; i++){
            int sum = -1;
            int temp = question[i];
            for(int j=0; j<n; j++){
                sum += num[j];
                if(sum >=temp){
                    System.out.println(j+1);
                    break;
                }
            }
        }
    }
}
