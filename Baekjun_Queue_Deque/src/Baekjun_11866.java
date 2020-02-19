import java.util.LinkedList;
import java.util.Scanner;

public class Baekjun_11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> list = new LinkedList<>();
        int N = sc.nextInt();
        int K = sc.nextInt() - 1;
        int index = K;
        for(int i=1; i<=N; i++) list.add(i);
        sb.append("<");
        while(list.size() != 1){
            sb.append(list.get(index).toString() + ", ");
            list.remove(index);
            index = (index+K) % list.size();
        }
        sb.append(list.poll() + ">");
        System.out.println(sb);
    }
}
