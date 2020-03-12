import java.util.Scanner;

public class Baekjun_2576 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int min = 101;
        boolean odd = false;
        for(int i=0; i<7; i++){
            int num = sc.nextInt();
            if(num%2==1){
                sum += num;
                odd = true;
                if(num < min) min = num;
            }
        }
        if(odd){
            System.out.println(sum);
            System.out.println(min);
        }
        else{
            System.out.println(-1);
        }
    }

}
