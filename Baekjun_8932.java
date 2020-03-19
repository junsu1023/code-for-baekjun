import java.util.Scanner;

public class Baekjun_8932 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int[] p = new int[7];
        for(int tc=0; tc<test_case; tc++){
            int sum = 0;
            for(int i=0; i<7; i++){
                p[i] = sc.nextInt();
                if(i==0) sum += 9.23076 * Math.pow((26.7-p[i]), 1.835);
                else if(i==1) sum += 1.84523 * Math.pow((p[i]-75), 1.348);
                else if(i==2) sum += 56.0211 * Math.pow((p[i]-1.5), 1.05);
                else if(i==3) sum += 4.99087 * Math.pow((42.5-p[i]), 1.81   );
                else if(i==4) sum += 0.188807 * Math.pow((p[i]-210), 1.41);
                else if(i==5) sum += 15.9803 * Math.pow((p[i]-3.8), 1.04);
                else if(i==6) sum += 0.11193 * Math.pow((254-p[i]), 1.88);
            }
            System.out.println(sum);
        }
    }

}
