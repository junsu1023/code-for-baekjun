import java.util.Scanner;

public class Baekjun_2783 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] seven_twentyfive = new int[2];
        for(int i=0; i<2; i++) seven_twentyfive[i] = sc.nextInt();
        double sprice = seven_twentyfive[0] * (1000.00/seven_twentyfive[1]);
        int test_case = sc.nextInt();
        int[] other = new int[2];
        double min = sprice;
        for(int i=0; i<test_case; i++){
            for(int j=0; j<2; j++){
                other[j] = sc.nextInt();
            }
            double oprice = other[0] * (1000.00/other[1]);
            if(oprice < min) min = oprice;
        }
        System.out.println(Math.round(min*100)/100.0);
    }
}
