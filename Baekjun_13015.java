import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_13015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int point1 = 0;
        int point2 = n-1;
        int point3 = 3*n-3;
        int point4 = 4*n-4;
        for(int i=0; i<2*n-1; i++){
            if(i==0 || i==2*n-2){
                for(int j=point1; j<=point2; j++) System.out.print("*");
                for(int j=point2+1; j<point3; j++) System.out.print(" ");
                for(int j=point3; j<=point4; j++) System.out.print("*");
            }
            else{
                for(int j=0; j<point1; j++) System.out.print(" ");
                System.out.print("*");
                for(int j=point1+1; j<point2; j++) System.out.print(" ");
                System.out.print("*");
                for(int j=point2+1; j<point3; j++) System.out.print(" ");
                if(point2 != point3) System.out.print("*");
                for(int j=point3+1; j<point4; j++) System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
            if(i<n-1){
                point1++;
                point2++;
                point3--;
                point4--;
            }
            else{
                point1--;
                point2--;
                point3++;
                point4++;
            }
        }
        br.close();
    }
}
