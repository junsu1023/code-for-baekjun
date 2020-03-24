import java.util.Scanner;

public class Baekjun_10992 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = n;
        int last = n;
        for(int i=0; i<n; i++){
            if(i==n-1) {
                for(int j=0; j<n*2-1; j++) System.out.print("*");
            }
            else {
                for (int j = 0; j < first; j++) System.out.print(j != first - 1 ? " " : "*");
                for (int j = first; j < last; j++) System.out.print(j != last - 1 ? " " : "*");
                System.out.println();
                first--;
                last++;
            }
        }
    }
}
