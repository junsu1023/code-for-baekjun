import java.util.Scanner;

public class Baekjun_11094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        sc.nextLine();
        for(int tc=0; tc<n; tc++){
            String line = sc.nextLine();
            if(line.contains("Simon says ")){
                for(int i=10; i<line.length(); i++) sb.append(line.charAt(i));
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
