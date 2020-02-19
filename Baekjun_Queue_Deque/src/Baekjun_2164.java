import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjun_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> que = new LinkedList<>();
        int cards = Integer.parseInt(br.readLine());
        for(int i=1; i<=cards; i++) que.add(i);
        while(que.size() != 1){
            que.poll();
            int move = que.poll();
            que.add(move);
        }
        System.out.println(que.poll());
    }
}
