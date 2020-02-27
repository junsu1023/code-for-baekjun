import java.util.Scanner;

public class Baekjun_1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int[] alpha = new int[30];
        char first;
        sc.nextLine();
        for(int i=0; i<test_case; i++){
            String name = sc.nextLine();
            first = name.charAt(0);
            alpha[first - 97]++;
        }
        boolean surrender = true;
        for(int i=0; i<alpha.length; i++){
            if(alpha[i] >= 5){
                surrender = false;
                System.out.print((char)(i+97));
            }
        }
        if(surrender) System.out.println("PREDAJA");
    }
}
