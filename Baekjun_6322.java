import java.util.Scanner;

public class Baekjun_6322 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int i=1;
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a==0 && b==0 && c==0) break;
            sb.append("Triangle #" + i + "\n");
            if(a==-1){
                if((c*c)-(b*b)<=0) sb.append("Impossible.\n");
                else sb.append("a = " + String.format("%.3f", Math.sqrt((c*c)-(b*b))) + "\n");
            }
            else if(b==-1){
                if((c*c)-(a*a)<=0) sb.append("Impossible.\n");
                else sb.append("b = " + String.format("%.3f", Math.sqrt((c*c)-(a*a))) + "\n");
            }
            else if(c==-1){
                sb.append("c = " + String.format("%.3f", Math.sqrt((a*a)+(b*b))) + "\n");
            }
            System.out.println(sb);
            sb.setLength(0);
            i++;
        }
    }
}
