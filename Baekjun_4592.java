import java.util.Scanner;

public class Baekjun_4592 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            StringBuilder sb = new StringBuilder();
            int test_case = sc.nextInt();
            if(test_case == 0) break;
            int[] n = new int[test_case];
            for(int i=0; i<test_case; i++) n[i] = sc.nextInt();
            sb.append(n[0] + " ");
            for(int i=1; i<test_case; i++){
                if(n[i] != n[i-1]) sb.append(n[i] + " ");
            }
            System.out.println(sb + "$");
        }
    }
}
