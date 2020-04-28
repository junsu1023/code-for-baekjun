import java.util.Scanner;

public class Baekjun_10173 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true){
            String[] line = sc.nextLine().split(" ");
            boolean check = false;;
            if(line[0].equals("EOI")) break;
            for(int i=0; i<line.length; i++){
                if((line[i].charAt(0)=='n' || line[i].charAt(0)=='N')
                        && (line[i].charAt(1)=='e' || line[i].charAt(1)=='E')
                        && (line[i].charAt(2)=='m' || line[i].charAt(2)=='M')
                        && (line[i].charAt(3)=='o' || line[i].charAt(3)=='O')){
                    check = true;
                    continue;
                }
            }
            if(check) sb.append("Found\n");
            else sb.append("Missing\n");
        }
        System.out.println(sb);
    }
}
