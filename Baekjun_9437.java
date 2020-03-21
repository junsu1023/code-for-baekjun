import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Baekjun_9437 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            List<Integer> list = new LinkedList<>();
            int n = sc.nextInt();
            if(n==0) break;
            int p = sc.nextInt();
            int p1 = 0;
            if(p%2==0) {
                p1 = p-1;
                list.add(p1);
                list.add((n+1)-p);
                list.add((n+1)-p1);
            }
            else {
                p1 = p+1;
                list.add(p1);
                list.add((n+1)-p);
                list.add((n+1)-p1);
            }
            Collections.sort(list);
            for(int i:list) System.out.print(i + " ");
            System.out.println();
            list.clear();
        }
    }
}
