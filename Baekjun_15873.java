import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjun_15873 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] num = br.readLine().toCharArray();
        int a=0, b=0;
        if(num.length== 4){
            a=10;
            b=10;
        }
        else if(num.length==3){
            if(num[1]-48==0){
                a=10;
                b=(int)num[2] - 48;
            }
            else if(num[2]-48==0){
                a=(int)num[0]-48;
                b=10;
            }
        }
        else{
            a=(int)num[0]-48;
            b=(int)num[1]-48;
        }
        int sum = a+b;
        System.out.println(sum);
    }

}
