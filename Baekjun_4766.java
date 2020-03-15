import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Baekjun_4766 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> list = new LinkedList<>();
        while(true){
            double temperature = sc.nextDouble();
            if(temperature==999) break;
            list.add(temperature);
        }
        for(int i=1; i<list.size(); i++){
            String change = String.format("%.2f", list.get(i)-list.get(i-1));
            System.out.println(change);
        }
    }
}
