import java.util.Scanner;

public class Baekjun_2858 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int w = sc.nextInt();
        int c = 0;
        int r = 0;
        for(c=1; ; c++){
            if(w%c==0){
                r = w/c;
                if(c*2 + r*2 + 4 == l){
                    System.out.println((r+2) + " " + (c+2));
                    break;
                }
            }
        }
    }
}
