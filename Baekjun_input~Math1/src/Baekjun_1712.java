import java.util.Scanner;

public class Baekjun_1712 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int staticCost = input.nextInt();
        int changeCost = input.nextInt();
        int sale = input.nextInt();
        if(changeCost >= sale)
            System.out.println("-1");
        else
            System.out.println(staticCost/(sale-changeCost)+1);
    }
}
