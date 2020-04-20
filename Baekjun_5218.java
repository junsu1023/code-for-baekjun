import java.util.Scanner;

public class Baekjun_5218 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        sc.nextLine();
        for(int tc=0; tc<test_case; tc++){
            StringBuilder sb = new StringBuilder();
            String arr1 = sc.next();
            String arr2 = sc.next();
            sb.append("Distances: ");
            for(int i=0; i<arr1.length(); i++){
                int distance = (int)(arr2.charAt(i)-'A') - (int)(arr1.charAt(i)-'A');
                if(distance < 0) distance += 26;
                sb.append(distance + " ");
            }
            System.out.println(sb);
        }
    }
}
