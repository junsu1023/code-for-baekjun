import java.util.Scanner;

public class Baekjun_4299 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int add_score = sc.nextInt();
        int sub_score = sc.nextInt();
        int MK = (add_score+sub_score)/2;
        int AFC = (add_score-sub_score)/2;
        if((add_score+sub_score)%2!=0 || (add_score-sub_score)%2!=0) System.out.println(-1);
        else{
            if(MK>=0 && AFC>=0){
                if(MK>AFC) System.out.println(MK + " " + AFC);
                else System.out.println(AFC + " " + MK);
            }
            else System.out.println(-1);
        }
    }
}
