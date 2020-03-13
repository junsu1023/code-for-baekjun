import java.util.Scanner;

public class Baekjun_2965 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] kangaroo = new int[3];
        for(int i=0; i<3; i++) kangaroo[i] = sc.nextInt();
        int length = Math.max(kangaroo[1]-kangaroo[0], kangaroo[2]-kangaroo[1]);
        System.out.println(length-1);
    }
}
