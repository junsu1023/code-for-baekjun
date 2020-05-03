import java.util.Scanner;

public class Baekjun_10874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] correct = {1,2,3,4,5,1,2,3,4,5};
        int[] student = new int[10];
        int[] score = new int[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<10; j++){
                student[j] = sc.nextInt();
                if(student[j] == correct[j]) score[i]++;
            }
        }
        for(int i=0; i<n; i++){
            if(score[i] == 10) System.out.println(i+1);
        }
    }
}
