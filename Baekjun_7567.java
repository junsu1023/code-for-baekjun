import java.util.Scanner;

public class Baekjun_7567 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] bowl = sc.nextLine().split("");
        int total = 10;
        for(int i=1; i<bowl.length; i++){
            if(bowl[i].equals(bowl[i-1])) total += 5;
            else total += 10;
        }
        System.out.println(total);
    }
}
