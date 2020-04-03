import java.util.Scanner;

public class Baekjun_1264 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String[] str = sc.nextLine().split("");
            int cnt = 0;
            if(str[0].equals("#")) break;
            for(int i=0; i<str.length; i++){
                switch(str[i]){
                    case "a":
                    case "e":
                    case "i":
                    case "u":
                    case "o":
                    case "A":
                    case "E":
                    case "I":
                    case "U":
                    case "O":
                        cnt++;
                        break;
                }
            }
            System.out.println(cnt);
        }
    }
}
