import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Baekjun_3059 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int i=0; i<test_case; i++){
            List<Character> list = new LinkedList<>();
            for(char j='A'; j<='Z'; j++) list.add(j);
            String arr = sc.next();
            for(int j=0; j<arr.length(); j++){
                for(int k=0; k<list.size(); k++){
                    if(list.get(k)==arr.charAt(j)) list.remove(k);
                }
            }
            int sum = 0;
            for(int j=0; j<list.size(); j++) sum += list.get(j);
            list.clear();
            System.out.println(sum);
        }
    }
}
