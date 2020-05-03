import java.util.Scanner;

public class Baekjun_10902 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        int[] s = new int[n];
        for(int i=0; i<n; i++){
            t[i] = sc.nextInt();
            s[i] = sc.nextInt();
        }
        int max = 0;
        int index = 0;
        for(int i=0; i<n; i++){
            if(s[i] > max){
                max = s[i];
                index = i;
            }
            else if(s[i] == max){
                if(t[i] < index) index = t[i];
            }
        }
        if(s[index] == 0) System.out.println(0);
        else System.out.println(t[index] + index * 20);
    }
}
