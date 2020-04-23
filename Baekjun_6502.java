import java.util.Scanner;

public class Baekjun_6502 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(true){
            double r = sc.nextDouble();
            if(r==0) break;
            double w = sc.nextDouble();
            double l = sc.nextDouble();
            if(w*w+l*l<=4*r*r) System.out.println("Pizza " + i + " fits on the table.");
            else System.out.println("Pizza " + i + " does not fit on the table.");
            i++;
        }
    }
}
