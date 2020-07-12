import java.util.Scanner;

public class Baekjun_1652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char[][] room = new char[n][n];
        String arr;
        int row = 0;
        int col = 0;
        for (int i = 0; i < n; i++) {
            arr = sc.nextLine();
            for (int j = 0; j < n; j++) {
                room[i][j] = arr.charAt(j);
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt = 0;
            for (int j = 0; j < n; j++) {
                if (room[j][i] == 'X') {
                    if (cnt >= 2) row++;
                    cnt = 0;
                }
                else cnt++;
            }
            if (cnt >= 2) row++;
        }

        for (int i = 0; i < n; i++) {
            cnt = 0;
            for (int j = 0; j < n; j++) {
                if (room[i][j] == 'X') {
                    if (cnt >= 2) col++;
                    cnt = 0;
                } else cnt++;
            }
            if (cnt >= 2) col++;
        }
        System.out.println(col + " " + row);
    }
}
