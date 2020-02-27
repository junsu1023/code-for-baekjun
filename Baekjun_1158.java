import java.util.LinkedList;
import java.util.Scanner;

public class Baekjun_1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int person = sc.nextInt();
        int sequence = sc.nextInt() - 1;
        int index = sequence;
        for(int i=1; i<=person; i++) list.add(i);
        sb.append("<");
        while(list.size() != 1){
            sb.append(list.get(index).toString() + ", ");
            list.remove(index);
            index = (index + sequence) % list.size();
        }
        sb.append(list.pop().toString() + ">");
        System.out.println(sb);
    }
}
