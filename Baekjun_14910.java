import java.util.Scanner;

public class Baekjun_14910 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        int before = -1000001;
        while(sc.hasNextInt()){
            int temp = sc.nextInt();
            if(check && (temp < before)) check = false;
            before = temp;
        }
        if(check) System.out.println("Good");
        else System.out.println("Bad");
    }
}
