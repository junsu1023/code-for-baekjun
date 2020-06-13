import java.util.Scanner;

public class Baekjun_11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        for(int i=0; i<w.length(); i++){
            if(i%10==0 && i!=0) System.out.println();
            System.out.print(w.charAt(i));
        }
    }
}
