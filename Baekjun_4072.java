import java.util.Scanner;

public class Baekjun_4072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            StringBuilder sb = new StringBuilder();
            String[] line = sc.nextLine().split(" ");
            if(line[0].equals("#")) break;
            for(int i=0; i<line.length; i++){
                for(int j=line[i].length()-1; j>=0; j--){
                    sb.append(line[i].charAt(j));
                }
                sb.append(" ");
            }
            System.out.println(sb);
        }
    }
}
