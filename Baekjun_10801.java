import java.util.Scanner;

public class Baekjun_10801 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int ascore = 0;
        int bscore = 0;
        for(int i=0; i<10; i++) a[i] = sc.nextInt();
        for(int i=0; i<10; i++) b[i] = sc.nextInt();
        for(int i=0; i<10; i++){
            if(a[i]>b[i]) ascore++;
            else if(a[i]<b[i]) bscore++;
        }
        if(ascore > bscore) System.out.println("A");
        else if(ascore < bscore) System.out.println("B");
        else System.out.println("D");
    }
}
