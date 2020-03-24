import java.util.Scanner;

public class Baekjun_10990 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = n;
        int last = n;
        for(int i=0; i<n; i++){
            for(int j=0; j<first; j++) System.out.print(j!=first-1 ? " " : "*");
            for(int j=first; j<last; j++) System.out.print(j!=last-1 ? " " : "*");
            System.out.println();
            first--;
            last++;
        }
    }
}
