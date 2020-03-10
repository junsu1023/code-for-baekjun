import java.util.Scanner;

public class Baekjun_2490 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] piece = new int[4];
        String result = "";
        for(int tc=0; tc<3; tc++){
            int count = 0;
            for(int i=0; i<4; i++) {
                piece[i] = sc.nextInt();
                if(piece[i] == 0) count++;
            }
            if(count == 0) result = "E";
            else if(count == 1) result = "A";
            else if(count == 2) result = "B";
            else if(count == 3) result = "C";
            else if(count == 4) result = "D";
            System.out.println(result);
        }
    }

}
