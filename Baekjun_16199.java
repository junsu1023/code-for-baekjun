import java.util.Scanner;

public class Baekjun_16199 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] year1 = new int[3];
        int[] year2 = new int[3];
        for(int i=0; i<3; i++) year1[i] = sc.nextInt();
        for(int i=0; i<3; i++) year2[i] = sc.nextInt();
        int American_age = year2[0]-year1[0];
        if(year2[1] - year1[1] < 0 || (year2[1] - year1[1] == 0 && year2[2] - year1[2] < 0)) American_age--;
        int count_age = year2[0] - year1[0] + 1;
        int year_age = year2[0] - year1[0];
        System.out.println(American_age);
        System.out.println(count_age);
        System.out.println(year_age);
    }
}
