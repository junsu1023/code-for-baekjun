import java.util.Scanner;

public class Baekjun_1002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp = input.nextInt();
        int res[] = new int[temp];
        for(int i=0; i<temp; i++) {
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            int r1 = input.nextInt();
            int x2 = input.nextInt();
            int y2 = input.nextInt();
            int r2 = input.nextInt();
            res[i] = contact(x1, y1, r1, x2, y2, r2);
            System.out.println(res[i]);
        }
    }
    public static int contact(int x1, int y1, int r1, int x2, int y2, int r2){
        double r = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        if(x1 == x2 && y1 == y2 && r1 == r2)
            return -1;
        else if(r > r1 + r2 || x1 == x2 && y1 == y2 && r1 != r2 ||  r < Math.abs(r1-r2))
            return 0;
        else if(r == r1 + r2 || Math.abs(r1-r2) == r)
            return 1;
        else return 2;
    }
}
