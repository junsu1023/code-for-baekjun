import java.util.*;

public class Baekjun_11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int person = sc.nextInt();
        int[] time = new int[person];
        for(int i=0; i<person; i++){
            time[i] = sc.nextInt();
        }
        Arrays.sort(time);
        int min = 0;
        int sum = 0;
        for(int i=0; i<time.length; i++){
            min += time[i];
            sum += min;
        }
        System.out.println(sum);
    }
}
