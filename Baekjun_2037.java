import java.util.Scanner;

public class Baekjun_2037 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int w = sc.nextInt();
        int[][] arr = {{ 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 4 },
                {1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9 }};
        sc.nextLine();
        String s = sc.nextLine();
        int bp = 0;
        int time = 0;
        for(int i=0; i<s.length(); i++){
            int index = -1;
            if(s.charAt(i)>='A' && s.charAt(i)<='Z') index = s.charAt(i) - 'A' + 1;
            if(s.charAt(i) == ' ') index = 0;
            if(index != -1){
                time += arr[0][index] * p;
                if(bp == arr[1][index] && index !=0) time += w;
                bp = arr[1][index];
            }
        }
        System.out.println(time);
    }
}
