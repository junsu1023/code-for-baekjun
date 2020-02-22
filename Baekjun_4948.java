import java.util.Scanner;

public class Baekjun_4948 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag;

        while(true){
            int enter = input.nextInt();
            if(enter == 0) break;
            int count = 0;
            for(int i=enter+1; i<=2*enter; i++){
                flag = false;
                for(int j=2; j<=(int)Math.sqrt(i); j++){
                    if(i%j==0) {
                        flag = true;
                        break;
                    }
                }
                if(!flag && i!=1) count++;
            }
            System.out.println(count);
        }
    }
}
