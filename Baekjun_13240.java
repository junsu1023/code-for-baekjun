import java.util.Scanner;

public class Baekjun_13240 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        int row = sc.nextInt();
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                if(i%2==0){
                    if(j%2==0) System.out.print("*");
                    else System.out.print(".");
                }
                else{
                    if(j%2==0) System.out.print(".");
                    else System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
