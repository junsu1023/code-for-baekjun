import java.util.Scanner;

public class Baekjun_2684 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            int[] arr = new int[8];
            String[] coin = sc.nextLine().split("");
            for(int j=0; j<38; j++){
                if(coin[j].equals("H")){
                    if(coin[j+1].equals("H")){
                        if(coin[j+2].equals("H")) arr[7]++;
                        else arr[6]++;
                    }
                    else{
                        if(coin[j+2].equals("H")) arr[5]++;
                        else arr[4]++;
                    }
                }
                else{
                    if(coin[j+1].equals("H")){
                        if(coin[j+2].equals("H")) arr[3]++;
                        else arr[2]++;
                    }
                    else{
                        if(coin[j+2].equals("H")) arr[1]++;
                        else arr[0]++;
                    }
                }
            }
            for(int j=0; j<8; j++) System.out.print(arr[j] + " ");
            System.out.println();
        }
    }
}
