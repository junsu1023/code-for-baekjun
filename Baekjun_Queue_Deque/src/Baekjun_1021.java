import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Baekjun_1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num = sc.nextInt();
        int elements = 0;
        int count = 0;
        boolean flag;
        List<Integer> list = new LinkedList<>();
        for(int i=1; i<=size; i++) list.add(i);
        for(int i=0; i<num; i++){
            elements = sc.nextInt();
            flag = false;
            while(!flag){
                if(list.get(0) == elements) {
                    list.remove(0);
                    flag = true;
                }
                else{
                    if(list.indexOf(elements) <= list.size()/2) list.add(list.size()-1, list.remove(0));
                    else list.add(0, list.remove(list.size()-1));
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
