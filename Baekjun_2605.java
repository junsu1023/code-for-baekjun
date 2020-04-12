import java.util.LinkedList;
import java.util.Scanner;

public class Baekjun_2605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        sc.nextLine();
        String[] push = sc.nextLine().split(" ");
        for (int i = 2; i <= n; i++) list.add(list.size() - Integer.parseInt(push[i-1]), i);
        for (int i = 0; i < n; i++) System.out.print(list.get(i) + " ");
    }
}
