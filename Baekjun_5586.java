import java.util.Scanner;

public class Baekjun_5586 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("");
        int j_cnt = 0;
        int i_cnt = 0;
        for(int i=0; i<arr.length-2; i++){
            if(arr[i].equals("J")){
                if(arr[i+1].equals("O") && arr[i+2].equals("I")) j_cnt++;
            }
            else if(arr[i].equals("I")){
                if(arr[i+1].equals("O") && arr[i+2].equals("I")) i_cnt++;
            }
        }
        System.out.println(j_cnt + "\n" + i_cnt);
    }
}
