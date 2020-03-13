import java.util.Scanner;

public class Baekjun_2991 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), D = sc.nextInt();
        int P = sc.nextInt(), N = sc.nextInt(), M = sc.nextInt();
        int[] dog_attack = {0, 0, 0};
        int p1 = P % (A+B), p2 = P % (C+D);
        int n1 = N % (A+B), n2 = N % (C+D);
        int m1 = M % (A+B), m2 = M % (C+D);
        if((p1 > 0 && p1 <= A) && (p2 > 0 && p2 <= C)) dog_attack[0] += 2;
        else if((p1 > 0 && p1 <= A) || (p2 > 0 && p2 <= C)) dog_attack[0] += 1;
        if((n1 > 0 && n1 <= A) && (n2 > 0 && n2 <= C)) dog_attack[1] += 2;
        else if((n1 > 0 && n1 <= A) || (n2 > 0 && n2 <= C)) dog_attack[1] += 1;
        if((m1 > 0 && m1 <= A) && (m2 > 0 && m2 <= C)) dog_attack[2] += 2;
        else if((m1 > 0 && m1 <= A) || (m2 > 0 && m2 <= C)) dog_attack[2] += 1;
        System.out.println(dog_attack[0]);
        System.out.println(dog_attack[1]);
        System.out.println(dog_attack[2]);
    }

}
