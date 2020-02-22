import java.util.Scanner;

public class Baekjun_10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int sum = 0;
        int top = -1;
        int[] arr = new int[test_case];
        int num;
        for(int tc=0; tc<test_case; tc++){
            num = sc.nextInt();
            if(num == 0) top--;
            else{
                top++;
                arr[top] = num;
            }
        }
        for(int i=0; i<top+1; i++)  sum += arr[i];
        System.out.println(sum);
    }
}
