import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Baekjun_5618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int[] n = new int[test_case];
        List<Integer> list = new LinkedList<>();
        for(int i=0; i<test_case; i++) n[i] = sc.nextInt();
        Arrays.sort(n);
        if(n.length==2){
            for(int i=1; i<=n[0]; i++){
                if(n[0]%i==0 && n[1]%i==0) list.add(i);
            }
        }
        else{
            for(int i=1; i<=n[0]; i++){
                if(n[0]%i==0 && n[1]%i==0 && n[2]%i==0) list.add(i);
            }
        }
        for(int i:list) System.out.println(i);
    }
}
