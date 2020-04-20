import java.util.Scanner;

public class Baekjun_5363 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        sc.nextLine();
        for(int tc=0; tc<test_case; tc++){
            StringBuilder sb = new StringBuilder();
            String[] line = sc.nextLine().split(" ");
            for(int i=2; i<line.length; i++){
                sb.append(line[i] + " ");
            }
            sb.append(line[0] + " " + line[1]);
            System.out.println(sb);
        }
    }
}
