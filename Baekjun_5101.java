import java.util.Scanner;

public class Baekjun_5101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int origin = sc.nextInt();
            int sequence = sc.nextInt();
            int goal = sc.nextInt();
            int count = 1;
            if(origin==0 && sequence==0 && goal==0) break;
            int check = (goal-origin)%Math.abs(sequence);
            int isCheck = (goal-origin)/Math.abs(sequence);
            if(check == 0) System.out.println(isCheck + 1);
            else System.out.println("X");
        }
    }
}
