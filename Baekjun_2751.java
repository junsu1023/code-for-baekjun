import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Baekjun_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rep = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<rep; i++){
            int num = Integer.parseInt(br.readLine());
            list.add(num);
        }
        Collections.sort(list);

        for(int i:list)
            System.out.println(i);
    }
}
