import java.util.Scanner;

public class Baekjun_2902 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String[] name = sc.nextLine().split("-");
        for(int i=0; i<name.length; i++){
            sb.append(name[i].charAt(0));
        }
        System.out.println(sb);
    }
}
