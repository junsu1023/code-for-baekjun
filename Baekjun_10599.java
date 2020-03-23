import java.util.Scanner;

public class Baekjun_10599 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int[] range = new int[4];
            for(int i=0; i<4; i++) range[i] = sc.nextInt();
            if(range[0]==0 && range[1]==0 && range[2]==0 && range[3]==0) break;
            int min = range[2]-range[1];
            int max = range[3]-range[0];
            System.out.println(min + " " + max);
        }
    }
}
