import java.util.Scanner;

public class Baekjun_11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kind = sc.nextInt();
        int price = sc.nextInt();
        int[] coin = new int[kind];
        int count = 0;
        for(int i=0; i<kind; i++){
            coin[i] = sc.nextInt();
        }
        for(int i=kind-1; i>=0; i--){
            if(price>=coin[i]){
                count += price/coin[i];
                price %= coin[i];
            }
        }
        System.out.println(count);
    }
}
