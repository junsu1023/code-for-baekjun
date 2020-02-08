import java.util.Scanner;

public class Baekjun_10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int top = -1;
        int[] arr = new int[test_case];
        String comment;
        for(int tc=0; tc<test_case; tc++){
            comment = sc.next();
            if(comment.equals("push")){
                top++;
                arr[top] = sc.nextInt();
            }
            else if(comment.equals("pop")){
                if(top == -1) System.out.println(-1);
                else {
                    System.out.println(arr[top]);
                    top--;
                }
            }
            else if(comment.equals("size")) System.out.println(top+1);
            else if(comment.equals("empty")){
                if(top == -1) System.out.println(1);
                else System.out.println(0);
            }
            else if(comment.equals("top")){
                if(top == -1) System.out.println(-1);
                else System.out.println(arr[top]);
            }
        }
    }
}
