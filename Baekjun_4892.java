import java.util.Scanner;

public class Baekjun_4892 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        while(true){
            int n = sc.nextInt();
            if(n==0) break;
            boolean even = true;
            int n1 = 3*n;
            int n2 = 0;
            if(n%2==1){
                even = false;
                n2 = (n1+1)/2;
            }
            else{
                n2 = n1/2;
            }
            int n3 = 3*n2;
            int n4 = n3/9;
            if(even) System.out.println(i + ". even " + n4);
            else System.out.println(i + ". odd " + n4);
            i++;
        }
    }
}
