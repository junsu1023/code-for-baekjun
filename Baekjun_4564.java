import java.util.Scanner;

public class Baekjun_4564 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            StringBuilder sb = new StringBuilder();
            String n = sc.next();
            if(n.equals("0")) break;
            sb.append(n + " ");
            while(true){
                if(n.length() == 1) {
                    System.out.println(sb);
                    break;
                }
                String[] arr = n.split("");
                int mul = 1;
                for(int i=0; i<arr.length; i++) mul *= Integer.parseInt(arr[i]);
                n = Integer.toString(mul);
                sb.append(n + " ");
            }
        }
    }
}
