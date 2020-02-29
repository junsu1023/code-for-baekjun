import java.util.Scanner;

public class Baekjun_14652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int count = -1;
        int i, j = 0;
        for(i=0; i<N; i++){
            for(j=0; j<M; j++){
                ++count;
                if(count == K){
                    System.out.println(i + " " + j);
                    break;
                }
            }
        }
    }
}
