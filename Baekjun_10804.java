import java.util.Scanner;

public class Baekjun_10804 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int tc=0; tc<10; tc++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            a -= 1;
            b -= 1;
            while(a<=b){
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                a++; b--;
            }
        }
        for(int i=0; i<arr.length; i++) System.out.print(arr[i] + " ");
    }
}
