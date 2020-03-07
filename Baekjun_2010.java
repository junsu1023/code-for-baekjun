import java.util.Scanner;

public class Baekjun_2010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] multitap = new int[num];
        int result = 0;
        for(int i=0; i<num; i++){
            multitap[i] = sc.nextInt();
            result += multitap[i];
        }
        System.out.println(result-num+1);
    }
}
