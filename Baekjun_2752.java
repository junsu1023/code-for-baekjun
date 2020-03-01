import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Baekjun_2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();
        int[] num = new int[3];
        for(int i=0; i<3; i++){
            num[i] = sc.nextInt();
            list.add(num[i]);
        }
        Collections.sort(list);
        for(int i:list) System.out.print(i + " ");
    }
}
