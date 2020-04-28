import java.util.Scanner;

public class Baekjun_10102 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String win = sc.nextLine();
        int a = 0;
        int b = 0;
        for(int i=0; i<win.length(); i++){
            if(win.charAt(i)=='A') a++;
            else if(win.charAt(i)=='B') b++;
        }
        if(a>b) System.out.println("A");
        else if(a<b) System.out.println("B");
        else System.out.println("Tie");
    }
}
