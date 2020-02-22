import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baekjun_2750 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rep = input.nextInt();
        int[] num = new int[rep];
        ArrayList<Integer> IntegerList = new ArrayList<Integer>();

        for(int i=0; i<rep; i++){
            num[i] = input.nextInt();
            IntegerList.add(num[i]);
        }

        Collections.sort(IntegerList);
        for(int i:IntegerList)
            System.out.println(i);
    }
}
