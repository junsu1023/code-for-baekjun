import java.util.Scanner;

public class Baekjun_10870 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int n1, n2, temp;
        n1=0;
        n2=1;
        temp=0;
        if(num == 0) temp = 0;
        else if(num == 1) temp = 1;
        else {
            for (int i = 0; i < num - 1; i++) {
                temp = n1 + n2;
                n1 = n2;
                n2 = temp;
            }
        }
        System.out.println(temp);
    }
}
