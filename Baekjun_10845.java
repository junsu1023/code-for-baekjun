import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjun_10845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> que = new LinkedList<>();
        int test_case = sc.nextInt();
        int input = 0;
        for(int tc=0; tc<test_case; tc++){
            String comment = sc.next();
            if(comment.equals("push")){
                input = sc.nextInt();
                que.add(input);
            }
            else if(comment.equals("pop")) System.out.println(que.isEmpty() ? -1 : que.poll());
            else if(comment.equals("size")) System.out.println(que.size());
            else if(comment.equals("empty")) System.out.println(que.isEmpty() ? 1 : 0);
            else if(comment.equals("front")) System.out.println(que.isEmpty() ? -1 : que.peek());
            else if(comment.equals("back")) System.out.println(que.isEmpty() ? -1 : input);
        }
    }
}
