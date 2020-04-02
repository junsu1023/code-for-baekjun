import java.util.Scanner;

public class Baekjun_17284 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n==1) sum += 500;
            else if(n==2) sum += 800;
            else if(n==3) sum += 1000;
        }
        System.out.println(5000-sum);
    }
}
