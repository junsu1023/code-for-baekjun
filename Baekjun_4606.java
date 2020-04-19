import java.util.Scanner;

public class Baekjun_4606 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String[] line = sc.nextLine().split("");
            if(line[0].equals("#")) break;
            StringBuilder temp = new StringBuilder();
            for(int i=0; i<line.length; i++){
                if(line[i].equals(" ")) temp.append("%20");
                else if(line[i].equals("!")) temp.append("%21");
                else if(line[i].equals("$")) temp.append("%24");
                else if(line[i].equals("%")) temp.append("%25");
                else if(line[i].equals("(")) temp.append("%28");
                else if(line[i].equals(")")) temp.append("%29");
                else if(line[i].equals("*")) temp.append("%2a");
                else temp.append(line[i]);
            }
            System.out.println(temp);
        }
    }
}
