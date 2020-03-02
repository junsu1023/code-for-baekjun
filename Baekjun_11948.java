import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjun_11948 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> sci = new ArrayList<>();
        List<Integer> his = new ArrayList<>();
        int[] science = new int[4];
        int[] history = new int[2];
        for(int i=0; i<4; i++) {
            science[i] = sc.nextInt();
            sci.add(science[i]);
        }
        for(int i=0; i<2; i++) {
            history[i] = sc.nextInt();
            his.add(history[i]);
        }
        Collections.sort(sci, Collections.reverseOrder());
        Collections.sort(his, Collections.reverseOrder());
        int sum = 0;
        for(int i=0; i<sci.size()-1; i++) sum += sci.get(i);
        for(int i=0; i<his.size()-1; i++) sum += his.get(i);
        System.out.println(sum);
    }

}
