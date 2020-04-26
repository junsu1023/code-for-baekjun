import java.util.Scanner;

public class Baekjun_9226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String line = sc.nextLine();
            String result = "";
            char[] vowel = {'a', 'e', 'u', 'i', 'o'};
            boolean check = false;
            if(line.equals("#")) break;
            for(int i=0; i<line.length(); i++){
                for(int j=0; j<5; j++){
                    if(line.charAt(i) == vowel[j]){
                        check = true;
                        break;
                    }
                }
                if(check){
                    result = line.substring(i, line.length()) + line.substring(0, i);
                    break;
                }
            }
            result += "ay";
            if(check) System.out.println(result);
            else System.out.println(line + "ay");
        }
    }
}
