import java.util.Scanner;

public class Baekjun_14581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==1 && j==1) System.out.print(":" + name + ":");
                else System.out.print(":fan:");
            }
            System.out.println();
        }
    }
}
