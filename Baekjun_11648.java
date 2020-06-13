import java.util.Scanner;

public class Baekjun_11648 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int len = n.length();
        int check = 0;
        while(len > 1){
            int temp = 1;
            for(int i=0; i<len; i++){
                temp *= Integer.parseInt(n.substring(i, i+1));
            }
            n = String.valueOf(temp);
            len = n.length();
            check++;
        }
        System.out.println(check);
    }
}
