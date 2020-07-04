import java.util.Scanner;

public class Baekjun_17122 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            String s1 = sc.next();
            int s2 = sc.nextInt();
            String check1 = "";
            String check2 = "";
            if((int)s1.charAt(0)%2==1){
                if((int)s1.charAt(1)%2==1) check1 = "black";
                else check1 = "white";
            }
            else{
                if((int)s1.charAt(1)%2==1) check1 = "white";
                else check1 = "black";
            }
            int line  = s2/8;
            if(s2%8!=0) line++;
            if(line%2==1){
                if(s2%2==1) check2 = "black";
                else check2 = "white";
            }
            else{
                if(s2%2==1) check2 = "white";
                else check2 = "black";
            }
            System.out.println((check1.equals(check2) ? "YES" : "NO"));
        }
    }
}
