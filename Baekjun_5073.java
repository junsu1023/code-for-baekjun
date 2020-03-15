import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_5073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int[] length = new int[3];
            for(int i=0; i<3; i++) length[i] = sc.nextInt();
            if(length[0] == 0 && length[1] == 0 && length[2] == 0) break;
            if(length[0] == length[1] && length[1] == length[2]) System.out.println("Equilateral");
            else if(length[0] == length[1] || length[1] == length[2] || length[0] == length[2]){
                Arrays.sort(length);
                if(length[0] + length[1] <= length[2]) System.out.println("Invalid");
                else System.out.println("Isosceles");
            }
            else{
                Arrays.sort(length);
                if(length[0] + length[1] <= length[2]) System.out.println("Invalid");
                else System.out.println("Scalene");
            }
        }
    }
}
