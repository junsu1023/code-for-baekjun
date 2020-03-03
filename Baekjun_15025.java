import java.util.Scanner;

public class Baekjun_15025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int moose1 = sc.nextInt();
        int moose2 = sc.nextInt();
        if(moose1 == 0 && moose2 == 0) System.out.println("Not a moose");
        else if(moose1 == moose2) System.out.println("Even " + moose1*2);
        else System.out.println(moose1 > moose2 ? ("Odd " + moose1*2) : ("Odd " + moose2*2));
    }
}
