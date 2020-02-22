import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Baekjun_10814 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num = input.nextInt();
        String[][] info = new String[num][2];
        for(int i=0; i<num; i++){
            info[i][0] = input.next();
            info[i][1] = input.next();
        }
        Arrays.sort(info, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
            }
        });

        for(int i=0; i<num; i++)
            System.out.println(info[i][0] + " " + info[i][1]);
    }
}
