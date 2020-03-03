import java.util.Scanner;

public class Baekjun_15059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] food = new int[3];
        int[] want = new int[3];
        for(int i=0; i<3; i++) food[i] = sc.nextInt();
        for(int i=0; i<3; i++) want[i] = sc.nextInt();
        int sum = 0;
        for(int i=0; i<3; i++){
            if(want[i] > food[i]) sum+=(want[i]-food[i]);
        }
        System.out.println(sum);
    }
}
