import java.util.Scanner;

public class Baekjun_9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int top = -1;
        String[] arr = new String[51];
        for(int tc=0; tc<test_case; tc++){
            boolean check = true;
            int count = 0;
            String bracket = sc.next();
            for(int i=0; i<bracket.length(); i++){
                arr[i] = String.valueOf(bracket.charAt(i));
                if(count < 0){
                    check = false;
                    break;
                }
                else{
                    if(arr[i].equals("(")) count++;
                    else count--;
                }
            }
            if(count==0) check = true;
            else check = false;
            System.out.println(check ? "YES" : "NO");
        }
    }
}
