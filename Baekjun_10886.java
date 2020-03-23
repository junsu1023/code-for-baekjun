import java.util.Scanner;

public class Baekjun_10886 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int cute = 0;
        int ncute = 0;
        for(int i=0; i<test_case; i++){
            int vote = sc.nextInt();
            if(vote==1) cute++;
            else ncute++;
        }
        if(cute > ncute) System.out.println("Junhee is cute!");
        else System.out.println("Junhee is not cute!");
    }
}
