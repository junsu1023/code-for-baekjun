import java.util.Scanner;

public class Baekjun_6321 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        sc.nextLine();
        for(int tc=0; tc<test_case; tc++){
            StringBuilder sb = new StringBuilder();
            sb.append("String #" + (tc+1) + "\n");
            String arr = sc.nextLine();
            for(int i=0; i<arr.length(); i++){
                if(arr.charAt(i)=='Z') sb.append('A');
                else sb.append((char)(arr.charAt(i)+1));
            }
            System.out.println(sb + "\n");
        }
    }
}
