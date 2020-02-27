import java.util.Scanner;

public class Baekjun_1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int count = 0;
        for(int i=0; i<5; i++) num[i] = sc.nextInt();
        int min = 100;
        for(int i=0; i<5; i++) {
            if (num[i] < min) min = num[i];
        }
        while(true){
            for(int i=0; i<num.length; i++){
                if(min%num[i]==0) count++;
            }
            if(count>=3) break;
            else{
                count = 0;
                min++;
            }
        }
        System.out.println(min);
    }
}
