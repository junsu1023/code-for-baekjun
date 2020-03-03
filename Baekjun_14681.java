import java.util.Scanner;

public class Baekjun_14681 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x_pos = sc.nextInt();
        int y_pos = sc.nextInt();
        int pos = 0;
        if(x_pos > 0 && y_pos > 0) pos = 1;
        else if(x_pos < 0 && y_pos > 0) pos = 2;
        else if(x_pos < 0 && y_pos < 0) pos = 3;
        else if(x_pos > 0 && y_pos < 0) pos = 4;
        System.out.println(pos);
    }
}
