import java.util.Scanner;

public class Baekjun_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int count = input.length;
        for(int i=0; i<input.length; i++){
            if(input[i].equals("")) count--;
        }
        System.out.println(count);
    }
}
