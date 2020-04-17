import java.util.Scanner;

public class Baekjun_3076 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=0; i<r*a; i++){
            for(int j=0; j<c*b; j++){
                if(i%(a*2) < a ){
                    if(j%(b*2) < b) System.out.print("X");
                    else System.out.print(".");
                }
                else{
                    if(j%(b*2) < b) System.out.print(".");
                    else System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
