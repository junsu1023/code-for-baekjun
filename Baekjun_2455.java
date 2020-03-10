import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_2455 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] population = new int[4];
        for(int i=0; i<4; i++){
            int get_off = sc.nextInt();
            int get_on = sc.nextInt();
            if(i==0) population[i] = get_on - get_off;
            else population[i] = population[i-1] - get_off + get_on;
        }
        Arrays.sort(population);
        System.out.println(population[3]);
    }

}
