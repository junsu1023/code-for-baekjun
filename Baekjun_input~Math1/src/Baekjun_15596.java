import java.util.Scanner;

public class Baekjun_15596 {
    public long sum(int[] a){
        int result=0;
        for(int i=0; i<a.length; i++){
            result += a[i];
        }
        return result;
    }
}
