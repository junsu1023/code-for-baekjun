import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Baekjun_8949 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        while(n1!=0 || n2!=0){
            int a = n1%10;
            int b = n2%10;
            n1/=10;
            n2/=10;
            list.add(a+b);
        }
        for(int i=list.size()-1; i>=0; i--) System.out.print(list.get(i));
    }
}
