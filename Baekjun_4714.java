import java.util.Scanner;

public class Baekjun_4714 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            double weight = sc.nextDouble();
            if(weight == -1.0) break;
            String moon = String.format("%.2f", weight*0.167);
            String earth = String.format("%.2f", weight);
            System.out.println("Objects weighing " + earth + " on Earth will weigh " + moon + " on the moon.");
        }
    }
}
