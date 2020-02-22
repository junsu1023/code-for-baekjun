import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_1427 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
        int size = num.length();
        char[] arr = new char[size];

        for(int i=0; i<size; i++){
            arr[i] = num.charAt(i);
        }
        Arrays.sort(arr);

        for(int i=arr.length-1; i>=0; i--)
            System.out.print(arr[i]);
    }
}
