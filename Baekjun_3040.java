import java.util.Scanner;

public class Baekjun_3040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] height = new int[9];
        int total = 0;
        for(int i=0; i<9; i++){
            height[i] = sc.nextInt();
            total += height[i];
        }
        total -= 100;
        int n1 = 0;
        int n2 = 0;
        for(int i=0; i<8; i++){
            for(int j=i+1; j<9; j++){
                if(height[i]+height[j]==total){
                    n1 = height[i];
                    n2 = height[j];
                    break;
                }
            }
        }
        for(int i=0; i<9; i++){
            if(height[i] != n1 && height[i] != n2) System.out.println(height[i]);
        }
    }
}
