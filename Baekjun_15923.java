import java.util.Scanner;

public class Baekjun_15923 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int point = sc.nextInt();
        int[] x = new int[point];
        int[] y = new int[point];
        for(int i=0; i<point; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int perimeter = 0;
        for(int i=0; i<point-1; i++){
            perimeter += (int)(Math.sqrt(Math.pow(x[i+1]-x[i], 2) + Math.pow(y[i+1]-y[i], 2)));
        }
        perimeter += (int)(Math.sqrt(Math.pow(x[point-1]-x[0], 2) + Math.pow(y[point-1]-y[0], 2)));
        System.out.println(perimeter);
    }

}
