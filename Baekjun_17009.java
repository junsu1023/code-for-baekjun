import java.util.Scanner;

public class Baekjun_17009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] team_apple = new int[3];
        int[] team_banana = new int[3];
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<3; i++) team_apple[i] = sc.nextInt();
        sum1 += team_apple[0]*3 + team_apple[1]*2 + team_apple[2];
        for(int i=0; i<3; i++)   team_banana[i] = sc.nextInt();
        sum2 += team_banana[0]*3 + team_banana[1]*2 + team_banana[2];
        if(sum1 > sum2) System.out.println("A");
        else if(sum1 < sum2) System.out.println("B");
        else System.out.println("T");
    }

}
