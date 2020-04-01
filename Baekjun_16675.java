import java.util.Scanner;

public class Baekjun_16675 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ml = sc.next().charAt(0);
        char mr = sc.next().charAt(0);
        char tl = sc.next().charAt(0);
        char tr = sc.next().charAt(0);
        if(winner(ml, tl) && winner(ml, tr)) System.out.println("MS");
        else if(winner(mr, tl) && winner(mr, tr)) System.out.println("MS");
        else if(winner(tl, ml) && winner(tl, mr)) System.out.println("TK");
        else if(winner(tr, ml) && winner(tr, mr))System.out.println("TK");
        else System.out.println("?");
    }

    public static boolean winner(char a, char b){
        if(a == 'R' && b == 'S') return true;
        else if(a == 'S' && b == 'P') return true;
        else if(a == 'P' && b == 'R') return true;
        return false;
    }
}
