import java.util.Scanner;

public class Baekjun_2522 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<2*num-1; i++){
            for(int j=0; j<Math.abs(num-i-1); j++) System.out.print(" ");
            for(int j=Math.abs(num-i-1); j<num; j++) System.out.print("*");
            System.out.println();
        }
    }
}
