import java.util.Scanner;

public class Baekjun_10569 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int vertex = sc.nextInt();
            int edge = sc.nextInt();
            System.out.println(2-vertex+edge);
        }
    }
}
