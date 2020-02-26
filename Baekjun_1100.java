import java.util.Scanner;

public class Baekjun_1100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] chess = new char[8][8];
        int count = 0;
        for(int i=0; i<8; i++){
            String input = sc.nextLine();
            for(int j=0; j<8; j++){
                chess[i][j] = input.charAt(j);
                if(chess[i][j]=='F' && (i+j)%2==0) count++;
            }
        }
        System.out.println(count);
    }
}
