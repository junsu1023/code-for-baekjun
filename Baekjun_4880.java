import java.util.Scanner;

public class Baekjun_4880 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int[] n = new int[3];
            for(int i=0; i<3; i++) n[i] = sc.nextInt();
            if(n[0]==0 && n[1]==0 && n[2]==0) break;
            if(n[1]-n[0] == n[2]-n[1]){
                int temp = n[1] - n[0];
                System.out.println("AP " + (n[2] + temp));
            }
            else if((n[1]/n[0] == n[2]/n[1]) && (n[1]%n[0]==0 && n[2]%n[1]==0)){
                int temp = n[1]/n[0];
                System.out.println("GP " + n[2] * temp);
            }
        }
    }
}
