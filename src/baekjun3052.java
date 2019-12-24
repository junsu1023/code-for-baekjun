import java.util.Scanner;
import java.util.Arrays;

public class baekjun3052 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = 0;
        int[] save = new int [10];
        int count = 1;
        for(int i=0; i<10; i++){
            num = input.nextInt();
            save[i] = num % 42;
        }
        Arrays.sort(save);

        for(int i=0; i<9; i++){
            if(save[i]!=save[i+1])
                count++;
        }
        System.out.println(count);
    }
}
