import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Baekjun_10866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dq = new LinkedList<>();
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            String comment = sc.next();
            if(comment.equals("push_front")){
                int input = sc.nextInt();
                dq.addFirst(input);
            }
            else if(comment.equals("push_back")){
                int input = sc.nextInt();
                dq.addLast(input);
            }
            else if(comment.equals("pop_front")) System.out.println(dq.isEmpty() ? -1 : dq.pop());
            else if(comment.equals("pop_back")) System.out.println(dq.isEmpty() ? -1 : dq.removeLast());
            else if(comment.equals("size")) System.out.println(dq.size());
            else if(comment.equals("empty")) System.out.println(dq.isEmpty() ? 1 : 0);
            else if(comment.equals("front")) System.out.println(dq.isEmpty() ? -1 : dq.peek());
            else if(comment.equals("back")) System.out.println(dq.isEmpty() ? -1 : dq.peekLast());
        }
    }
}
