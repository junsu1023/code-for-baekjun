import java.util.Scanner;

public class Baekjun_16727 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] p_home = new int[2];
        int[] e_home = new int[2];
        for(int i=0; i<2; i++) p_home[i] = sc.nextInt();
        for(int i=0; i<2; i++) e_home[i] = sc.nextInt();
        int perse = p_home[0] + e_home[1];
        int este = p_home[1] + e_home[0];
        if(perse > este) System.out.println("Persepolis");
        else if(perse < este) System.out.println("Esteghlal");
        else{
            if(p_home[1] > e_home[1]) System.out.println("Esteghlal");
            else if(p_home[1] < e_home[1]) System.out.println("Persepolis");
            else System.out.println("Penalty");
        }
    }

}
