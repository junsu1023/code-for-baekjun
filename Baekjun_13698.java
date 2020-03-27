import java.util.Scanner;

public class Baekjun_13698 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ball = {1, 0, 0, 2};
        String[] move = sc.nextLine().split("");
        for(int i=0; i<move.length; i++){
            switch(move[i]){
                case "A":
                    int temp = ball[0];
                    ball[0] = ball[1];
                    ball[1] = temp;
                    break;
                case "B":
                    temp = ball[0];
                    ball[0] = ball[2];
                    ball[2] = temp;
                    break;
                case "C":
                    temp = ball[0];
                    ball[0] = ball[3];
                    ball[3] = temp;
                    break;
                case "D":
                    temp = ball[1];
                    ball[1] = ball[2];
                    ball[2] = temp;
                    break;
                case "E":
                    temp = ball[1];
                    ball[1] = ball[3];
                    ball[3] = temp;
                    break;
                case "F":
                    temp = ball[2];
                    ball[2] = ball[3];
                    ball[3] = temp;
                    break;
            }
        }
        for(int i=0; i<4; i++){
            if(ball[i] == 1) System.out.println(i+1);
        }
        for(int i=0; i<4; i++){
            if(ball[i] == 2) System.out.println(i+1);
        }
    }
}
