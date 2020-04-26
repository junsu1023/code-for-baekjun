import java.util.Scanner;

public class Baekjun_9243 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        boolean check = true;
        String origin = sc.nextLine();
        String convert = sc.nextLine();
        if(n%2==1){
            for (int i = 0; i < origin.length(); i++) {
                if (origin.charAt(i) == convert.charAt(i)) {
                    check = false;
                    break;
                }
            }
        }
        else{
            for (int i = 0; i < origin.length(); i++) {
                if (origin.charAt(i) != convert.charAt(i)) {
                    check = false;
                    break;
                }
            }
        }
        if(check) System.out.println("Deletion succeeded");
        else System.out.println("Deletion failed");
    }
}
