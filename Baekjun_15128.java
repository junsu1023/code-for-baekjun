import java.util.Scanner;

public class Baekjun_15128 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] first = new int[2];
        int[] second = new int[2];
        for(int i=0; i<2; i++) first[i] = sc.nextInt();
        for(int i=0; i<2; i++) second[i] = sc.nextInt();
        double process = ((double)first[0]/second[1])*((double)second[0]/first[1]);
        if(process%2==0) System.out.println(1);
        else System.out.println(0);
    }
}
