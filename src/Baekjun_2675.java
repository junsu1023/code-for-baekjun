import java.util.Scanner;

public class Baekjun_2675 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int test = input.nextInt();

        for(int i=0; i<test; i++){
            int rep = input.nextInt();
            String arr = input.next();
            for(int j=0; j<arr.length(); j++){
                for(int k=0; k<rep; k++)
                    System.out.print(arr.charAt(j));
            }
            System.out.println();
        }
    }
}
