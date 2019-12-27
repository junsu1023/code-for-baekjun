import java.util.*;

public class Baekjun_2941 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] chr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String enter = input.nextLine();
        for(int i=0; i<8; i++)
            enter = enter.replace(chr[i], "a");
        System.out.println(enter.length());
    }
}
