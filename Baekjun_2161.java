import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjun_2161 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> que = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) que.add(i);
        while(que.size() != 1){
            sb.append(que.poll() + " ");
            que.add(que.poll());
        }
        sb.append(que.poll());
        System.out.print(sb);
    }
}
