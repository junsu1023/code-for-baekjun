import java.util.Scanner;

public class Baekjun_2083 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String s = sc.next();
            int age = sc.nextInt();
            int weight = sc.nextInt();
            if(s.equals("#") && age ==0 && weight==0) break;
            String a = "";
            if(age > 17 || weight >= 80) a = "Senior";
            else a = "Junior";
            System.out.println(s + " " + a);
        }
    }
}
