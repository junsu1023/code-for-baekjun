import java.util.Scanner;

public class Baekjun_2810{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String seat = sc.nextLine();
        int people = seat.length();
        seat = seat.replace("S", "*");
        seat = seat.replace("LL", "*");
        int cupholder = seat.length();
        if(cupholder >= people) System.out.println(people);
        else System.out.println(cupholder + 1);
    }
}