import java.util.Scanner;

public class Baekjun_5355 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        sc.nextLine();
        for(int tc=0; tc<test_case; tc++){
            String[] line = sc.nextLine().split(" ");
            double num = Double.parseDouble(line[0]);
            for(int i=1; i<line.length; i++){
                if(line[i].equals("@")) num *= 3;
                else if(line[i].equals("%")) num += 5;
                else if(line[i].equals("#")) num -= 7;
            }
            System.out.printf("%.2f\n", num);
        }
    }
}
