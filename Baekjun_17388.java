import java.util.Scanner;

public class Baekjun_17388 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] universe = new int[3];
        int sum = 0;
        for(int i=0; i<3; i++){
            universe[i] = sc.nextInt();
            sum += universe[i];
        }
        if(sum>=100) System.out.println("OK");
        else{
            int min = 101;
            for(int i=0; i<3; i++){
                if(min>universe[i]) min = universe[i];
            }
            if(min == universe[0]) System.out.println("Soongsil");
            else if(min == universe[1]) System.out.println("Korea");
            else if(min == universe[2]) System.out.println("Hanyang");
        }
    }

}
