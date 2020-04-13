import java.util.Scanner;

public class Baekjun_2789 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String word = sc.nextLine();
        char[] stop = {'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E'};
        for(int i=0; i<word.length(); i++){
            boolean check = true;
            for(int j=0; j<9; j++){
                if(word.charAt(i) == stop[j]) check = false;
            }
            if(check) sb.append(word.charAt(i));
        }
        System.out.println(sb);
    }
}
