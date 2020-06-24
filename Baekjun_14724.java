import java.util.Scanner;

public class Baekjun_14724 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] score = new int[9][n];
        int[] temp = new int[9];
        for(int i=0; i<9; i++){
            for(int j=0; j<n; j++){
                score[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        int index = 0;
        for(int i=0; i<9; i++){
            for(int j=0; j<n; j++){
                if(score[i][j] > max){
                    max = score[i][j];
                    index = i;
                }
            }
        }
        String team = "";
        switch(index){
            case 0:
                team = "PROBRAIN";
                break;
            case 1:
                team = "GROW";
                break;
            case 2:
                team = "ARGOS";
                break;
            case 3:
                team = "ADMIN";
                break;
            case 4:
                team = "ANT";
                break;
            case 5:
                team = "MOTION";
                break;
            case 6:
                team = "SPG";
                break;
            case 7:
                team = "COMON";
                break;
            case 8:
                team = "ALMIGHTY";
                break;
        }
        System.out.println(team);
    }
}
