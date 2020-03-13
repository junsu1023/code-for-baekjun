import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_2997 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        for(int i=0; i<3; i++) num[i] = sc.nextInt();
        Arrays.sort(num);
        int interval = Math.min(num[1]-num[0], num[2]-num[1]);
        if(num[1]-num[0] != interval) System.out.println(num[0] + interval);
        else if(num[2]-num[1] != interval) System.out.println(num[1] + interval);
        else  System.out.println(num[2] + interval);
    }
}
