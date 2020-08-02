import java.util.Scanner;

public class Baekjun_2851 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int sum = 0;
        int[] arr = new int[10];
        for(int i=0; i<10; i++){
            int mushroom = sc.nextInt();
            if(i==0 && mushroom >= 100){
                total = mushroom;
                break;
            }
            else{
                sum += mushroom;
                arr[i] = sum;
                if(sum > 100){
                    if(Math.abs(arr[i-1] - 100) < Math.abs(arr[i] - 100)){
                        total = arr[i-1];
                        break;
                    }
                    else if(Math.abs(arr[i-1] - 100) >= Math.abs(arr[i] - 100)){
                        total = arr[i];
                        break;
                    }
                }
            }
        }
        if(sum<100 && total == 0) total = sum;
        System.out.println(total);
    }
}
