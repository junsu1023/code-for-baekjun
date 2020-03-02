import java.util.Scanner;

public class Baekjun_11549 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        int count = 0;
        for(int i=0; i<5; i++){
            int participate = sc.nextInt();
            if(participate == answer) count++;
        }
        System.out.println(count);
    }
}