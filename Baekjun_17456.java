import java.util.Scanner;

public class Baekjun_17456 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] sum = new double[3];
        for(int i=0; i<3; i++)
        {
            int price = sc.nextInt();
            int weight = sc.nextInt();
            int total_price = price * 10;
            int total_weight = weight * 10;
            if(total_price >= 5000) total_price -= 500;
            sum[i] = (double)total_weight/total_price;
        }
        double max = sum[0];
        for(int i=1; i<3; i++){
            if(sum[i] > max) max = sum[i];
        }
        String good = "";
        for(int i=0; i<3; i++){
            if(max==sum[0]) good = "S";
            else if(max==sum[1]) good = "N";
            else good = "U";
        }
        System.out.println(good);
    }

}
