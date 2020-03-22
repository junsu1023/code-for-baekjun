import java.util.Scanner;

public class Baekjun_10395 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] first = new int[5];
        int[] second = new int[5];
        boolean check = true;
        for(int i=0; i<5; i++) first[i] = sc.nextInt();
        for(int i=0; i<5; i++) second[i] = sc.nextInt();
        for(int i=0; i<5; i++){
            if(first[i] == second[i]){
                check = false;
                break;
            }
        }
        if(check) System.out.println("Y");
        else System.out.println("N");
    }
}
