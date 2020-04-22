import java.util.Scanner;

public class Baekjun_5656 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i=1;
        while(true){
            String check = "";
            String[] line = sc.nextLine().split(" ");
            if(line[1].equals("E")) break;
            if(line[1].equals(">")){
                if(Integer.parseInt(line[0]) > Integer.parseInt(line[2])) check = "true";
                else check = "false";
            }
            else if(line[1].equals(">=")){
                if(Integer.parseInt(line[0]) >= Integer.parseInt(line[2])) check = "true";
                else check = "false";
            }
            else if(line[1].equals("<")){
                if(Integer.parseInt(line[0]) < Integer.parseInt(line[2])) check = "true";
                else check = "false";
            }
            else if(line[1].equals("<=")){
                if(Integer.parseInt(line[0]) <= Integer.parseInt(line[2])) check = "true";
                else check = "false";
            }
            else if(line[1].equals("==")){
                if(Integer.parseInt(line[0]) == Integer.parseInt(line[2])) check = "true";
                else check = "false";
            }
            else if(line[1].equals("!=")){
                if(Integer.parseInt(line[0]) != Integer.parseInt(line[2])) check = "true";
                else check = "false";
            }
            System.out.println("Case " + i + ": " + check);
            i++;
        }
    }
}
