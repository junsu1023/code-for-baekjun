import java.util.Scanner;

public class Baekjun_3028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String comment = sc.nextLine();
        int[] pos = {1, 2, 3};
        char word;
        for(int i=0; i<comment.length(); i++){
            word = comment.charAt(i);
            if(word == 'A'){
                int temp = pos[0];
                pos[0] = pos[1];
                pos[1] = temp;
            }
            else if(word == 'B'){
                int temp = pos[1];
                pos[1] = pos[2];
                pos[2] = temp;
            }
            else if(word == 'C'){
                int temp = pos[2];
                pos[2] = pos[0];
                pos[0] = temp;
            }
        }
        for(int i=0; i<3; i++){
            if(pos[i] == 1) {
                System.out.println(i+1);
                break;
            }
        }
    }
}
