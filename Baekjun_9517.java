import java.util.Scanner;

public class Baekjun_9517 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bomb_pos = sc.nextInt();
        int question = sc.nextInt();
        int cnt = bomb_pos;
        int sum = 0;
        int[] second = new int[question];
        String[] result = new String[question];
        for(int i=0; i<question; i++){
            second[i] = sc.nextInt();
            result[i] = sc.next();
        }
        for(int i=0; i<question; i++){
            if(result[i].equals("T")){
                sum += second[i];
                if(sum > 210) break;
                cnt++;
                if(cnt==9) cnt=1;
            }
            else if(result[i].equals("N") || result[i].equals("P")) sum += second[i];
        }
        System.out.println(cnt);
    }
}
