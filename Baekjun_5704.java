import java.util.Scanner;

public class Baekjun_5704 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String line = sc.nextLine();
            if(line.equals("*")) break;
            boolean[] alpha = new boolean[123];
            boolean check = true;
            for(int i=0; i<line.length(); i++) alpha[line.charAt(i)] = true;
            for(char c=97; c<=122; c++){
                if(!alpha[c]){
                    check = false;
                    break;
                }
            }
            if(check) System.out.println("Y");
            else System.out.println("N");
        }
    }
}
