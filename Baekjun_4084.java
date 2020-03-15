import java.util.Scanner;

public class Baekjun_4084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int[] n = new int[4];
            int t1, t2, t3, t4;
            int j=0;
            for(int i=0; i<4; i++) n[i] = sc.nextInt();
            if(n[0]==0 && n[1]==0 && n[2]==0 && n[3]==0) break;
            while(!(n[0]==n[1] && n[1]==n[2] && n[2]==n[3])){
                t1 = Math.abs(n[0]-n[1]);
                t2 = Math.abs(n[1]-n[2]);
                t3 = Math.abs(n[2]-n[3]);
                t4 = Math.abs(n[3]-n[0]);
                n[0] = t1; n[1] = t2; n[2] = t3; n[3] = t4;
                j++;
            }
            System.out.println(j);
        }
    }
}
