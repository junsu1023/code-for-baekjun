import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjun_1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int size = sc.nextInt();
        for(int i=0; i<size; i++) list1.add(sc.nextInt());
        for(int i=0; i<size; i++) list2.add(sc.nextInt());
        Collections.sort(list1);
        Collections.sort(list2, Collections.reverseOrder());
        int result = 0;
        for(int i=0; i<size; i++) result += list1.get(i)*list2.get(i);
        System.out.println(result);
    }
}
