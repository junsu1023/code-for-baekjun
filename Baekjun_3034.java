import java.util.Scanner;

public class Baekjun_3034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matches = sc.nextInt();
        int col = sc.nextInt();
        int row = sc.nextInt();
        double diagonal = Math.sqrt(col*col + row*row);
        for(int i=0; i<matches; i++){
            int length = sc.nextInt();
            if(length <= col || length <= row || length <= diagonal) System.out.println("DA");
            else System.out.println("NE");
        }
    }
}
