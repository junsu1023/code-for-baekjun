import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_15947 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = n/14;
        n = n%14;
        if(n == 1 || n == 13) System.out.println("baby");
        else if(n == 2 || n == 14 || n == 0) System.out.println("sukhwan");
        else if(n == 5) System.out.printf("very");
        else if(n == 6) System.out.printf("cute");
        else if(n == 9) System.out.printf("in");
        else if(n == 10) System.out.printf("bed");
        else {
            if(n == 3 || n == 7 || n == 11){
                if(a<3){
                    System.out.print("tururu");
                    for(int i=1; i<=a; i++) System.out.print("ru");
                }
                else System.out.print("tu+ru*" + (a+2));
            }
            else if(n==4 || n==8 || n==12){
                if(a < 4){
                    System.out.print("turu");
                    for(int i=1; i<=a; i++)  System.out.print("ru");
                }
                else System.out.print("tu+ru*" + (a+1));
            }
        }
        br.close();
    }
}
