import java.util.Scanner;
import java.util.Stack;

public class Baekjun_4949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String sentence = sc.nextLine();
            if(sentence.equals(".")) break;
            String[] str = sentence.split("");
            Stack<String> stack = new Stack<>();

            for(String i : str){
                if(i.equals("(") || i.equals("[")) stack.push(i);
                else if(i.equals(")") && !stack.isEmpty() && stack.peek().equals("(")) stack.pop();
                else if(i.equals("]") && !stack.isEmpty() && stack.peek().equals("[")) stack.pop();
                else if(i.equals(")") || i.equals("]")) stack.push(i);
            }
            if(stack.isEmpty()) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
