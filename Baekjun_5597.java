import java.util.Scanner;

public class Baekjun_5597 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean[] student = new boolean[31];
        for(int i=0; i<28; i++){
            int n = sc.nextInt();
            student[n] = true;
        }
        for(int i=1; i<=30; i++){
            if(!student[i]) System.out.println(i);
        }
    }
}
