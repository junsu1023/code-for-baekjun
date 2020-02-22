import java.util.Scanner;

public class Baekjun_2884 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int H = input.nextInt();
        int M = input.nextInt();
        int reM = M-45;
        if(reM<0){
            reM += 60;
            H--;
            if(H<0)
                H+=24;
        }
        System.out.println(H + " " + reM);
    }
}

