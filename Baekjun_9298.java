import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Baekjun_9298 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Double> ax = new LinkedList<>();
        List<Double> ay = new LinkedList<>();
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int ant = sc.nextInt();
            for(int i=0; i<ant; i++){
                double xpos = sc.nextDouble();
                double ypos = sc.nextDouble();
                ax.add(xpos);
                ay.add(ypos);
            }
            Collections.sort(ax);
            Collections.sort(ay);
            double col = ax.get(ax.size()-1) - ax.get(0);
            double row = ay.get(ax.size()-1) - ay.get(0);
            double area = col * row;
            double perimeter = 2*col + 2*row;
            System.out.print("Case " + (tc+1) + ": ");
            System.out.println("Area " + area + ", Perimeter " + perimeter);
            ax.clear();
            ay.clear();
        }
    }

}
