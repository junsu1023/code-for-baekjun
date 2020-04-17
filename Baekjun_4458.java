import java.util.Scanner;

public class Baekjun_4458 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        sc.nextLine();
        for(int tc=0; tc<test_case; tc++){
            StringBuilder sb = new StringBuilder();
            String[] line = sc.nextLine().split("");
            line[0] = line[0].toUpperCase();
            for(int i=0; i<line.length; i++) System.out.print(line[i]);
            System.out.println();
        }
    }
}
