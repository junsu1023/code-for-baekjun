import java.util.Scanner;

public class Baekjun_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] method = new int[3];
        int[] bascket = new int[n];
        for(int i=0; i<m; i++){
            for(int j=0; j<3; j++){
                method[j] = sc.nextInt();
            }
            for(int j=method[0]-1; j<method[1]; j++) bascket[j] = method[2];
        }
        for(int i=0; i<bascket.length; i++) System.out.print(bascket[i] + " ");
    }
}
