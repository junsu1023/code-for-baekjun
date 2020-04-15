import java.util.Scanner;

public class Baekjun_2966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = sc.next();
        int sang = 0;
        int chang = 0;
        int hyun = 0;
        for(int i=0; i<ans.length(); i++){
            if(i%3==0) {if(ans.charAt(i) == 'A') sang++;}
            else if(i%3==1) {if(ans.charAt(i) == 'B') sang++;}
            else if(i%3==2) {if(ans.charAt(i) == 'C') sang++;}
            if(i%4==0 || i%4==2) {if(ans.charAt(i) == 'B') chang++;}
            else if(i%4 == 1) {if(ans.charAt(i) == 'A') chang++;}
            else if(i%4==3) {if(ans.charAt(i) == 'C') chang++;}
            if(i%6==0 || i%6==1) {if(ans.charAt(i) == 'C') hyun++;}
            else if(i%6==2 || i%6==3) {if(ans.charAt(i) == 'A') hyun++;}
            else if(i%6==4 || i%6==5) {if(ans.charAt(i) == 'B') hyun++;}
        }
        if(sang > chang){
            if (sang > hyun) System.out.println(sang+ "\nAdrian");
            else if (sang < hyun) System.out.println(hyun + "\nGoran");
            else System.out.println(sang + "\nAdrian\nGoran");
        }
        else if (sang < chang) {
            if (chang > hyun) System.out.println(chang + "\nBruno");
            else if (chang < hyun) System.out.println(hyun + "\nGoran");
            else System.out.println(chang + "\nBruno\nGoran");
        }
        else {
            if (chang > hyun) System.out.println(chang + "\nAdrian\nBruno");
            else if (chang < hyun) System.out.println(hyun + "\nGoran");
            else System.out.println(sang + "\nAdrian\nBruno\nGoran");
        }
    }
}
