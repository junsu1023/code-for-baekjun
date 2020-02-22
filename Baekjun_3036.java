import java.util.Scanner;

public class Baekjun_3036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] circle = new int[num];
        for(int i=0; i<num; i++){
            circle[i] = sc.nextInt();
        }
        for(int i=1; i<num; i++) {
            getGCD(circle[0], circle[i]);
        }
    }
    public static void getGCD(int a, int b){
        int temp;
        int first = a;
        int next = b;
        while(b>0){
            temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(first/a + "/" + next/a);
    }
}
