import java.util.Scanner;

public class Baekjun_3449 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        sc.nextLine();
        for(int tc=0; tc<test_case; tc++){
            String arr1 = sc.nextLine();
            String arr2 = sc.nextLine();
            int distance = 0;
            for(int i=0; i<arr1.length(); i++){
                if(arr1.charAt(i) != arr2.charAt(i)) distance++;
            }
            System.out.println("Hamming distance is " + distance + ".");
        }
    }
}
