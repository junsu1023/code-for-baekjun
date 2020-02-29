import java.util.Scanner;

public class Baekjun_2845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int population_per_area = sc.nextInt();
        int area = sc.nextInt();
        int total_population = population_per_area * area;
        int[] population_per_newspaper = new int[5];
        for(int i=0; i<5; i++) {
            population_per_newspaper[i] = sc.nextInt();
            System.out.print(population_per_newspaper[i] - total_population + " ");
        }
    }
}
