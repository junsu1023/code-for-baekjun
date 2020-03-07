import java.util.Scanner;

public class Baekjun_1703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[21];
        a[0] = 1;
        while(true){
            int age = sc.nextInt();
            if(age == 0) break;
            for(int i=1; i<=age; i++){
                int splitting_factor = sc.nextInt();
                int level_lop = sc.nextInt();
                a[i] = a[i-1]*splitting_factor - level_lop;
            }
            System.out.println(a[age]);
        }
    }
}
