import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Baekjun_14915 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n==0) System.out.println(0);
        while(n != 0){
            int temp = n%m;
            if(temp < 10) list.add(Integer.toString(n%m));
            else{
                switch (temp){
                    case 10:
                        list.add("A");
                        break;
                    case 11:
                        list.add("B");
                        break;
                    case 12:
                        list.add("C");
                        break;
                    case 13:
                        list.add("D");
                        break;
                    case 14:
                        list.add("E");
                        break;
                    case 15:
                        list.add("F");
                        break;
                }
            }
            n/=m;
        }
        for(int i=list.size()-1; i>=0; i--) System.out.print(list.get(i));
    }
}
