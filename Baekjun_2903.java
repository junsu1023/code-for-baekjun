import java.util.Scanner;

public class Baekjun_2903 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int point = 2;
        for(int i=0; i<num; ++i) point += point-1;
        System.out.println(point*point);
    }
}
