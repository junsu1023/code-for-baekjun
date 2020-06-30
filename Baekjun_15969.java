import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_15969 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] students = new int[n];
        for(int i=0; i<n; i++) students[i] = sc.nextInt();
        Arrays.sort(students);
        System.out.println(students[n-1]-students[0]);
    }
}
