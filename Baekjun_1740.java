import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjun_1740 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        Queue<Long> que = new LinkedList<>();
        while(n!=0){
            que.add(n%2);
            n/=2;
        }
        long result = 0;
        long mul = 1;
        while(!que.isEmpty()){
            result += que.peek() * mul;
            mul *= 3;
            que.poll();
        }
        System.out.println(result);
    }
}
