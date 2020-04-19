import java.util.Scanner;

public class Baekjun_4740 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            StringBuilder sb = new StringBuilder();
            String line = sc.nextLine();
            if(line.equals("***")) break;
            String[] arr = line.split("");
            for(int i=arr.length-1; i>=0; i--){
                sb.append(arr[i]);
            }
            System.out.println(sb);
        }
    }
}
