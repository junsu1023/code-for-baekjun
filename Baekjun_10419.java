import java.util.Scanner;

public class Baekjun_10419 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int study = sc.nextInt();
            int late = 0;
            for(int i=1; i<study; i++){
                if(i+i*i<=study) late++;
            }
            System.out.println(late);
        }
    }
}
