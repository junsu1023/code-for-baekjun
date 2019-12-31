import java.util.Scanner;

public class Baekjun_3009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] x = new int[4];
        int[] y = new int[4];
        for(int i=0; i<3; i++){
            x[i] = input.nextInt();
            y[i] = input.nextInt();
        }

        x[3] = x[0];
        y[3] = y[0];
        if(x[3] == x[1]) x[3] = x[2];
        else if(x[3] == x[2]) x[3] = x[1];
        if(y[3] == y[1]) y[3] = y[2];
        else if(y[3] == y[2]) y[3] = y[1];

        System.out.println(x[3] + " " + y[3]);
    }
}
