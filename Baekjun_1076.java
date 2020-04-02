import java.util.Scanner;

public class Baekjun_1076 {
    public static long result = 0;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String[] color = new String[3];
        for(int i=0; i<3; i++) color[i] = sc.nextLine();
        value(color[0]);
        value(color[1]);
        mul(color[2]);
        System.out.println(result);
    }

    public static void value(String c){
        switch(c){
            case "black":
                result *= 10;
                result += 0;
                break;
            case "brown":
                result *= 10;
                result += 1;
                break;
            case "red":
                result *= 10;
                result += 2;
                break;
            case "orange":
                result *= 10;
                result += 3;
                break;
            case "yellow":
                result *= 10;
                result += 4;
                break;
            case "green":
                result *= 10;
                result += 5;
                break;
            case "blue":
                result *= 10;
                result += 6;
                break;
            case "violet":
                result *= 10;
                result += 7;
                break;
            case "grey":
                result *= 10;
                result += 8;
                break;
            case "white":
                result *= 10;
                result += 9;
                break;
        }
    }

    public static void mul(String c){
        switch(c){
            case "black":
                result *= 1;
                break;
            case "brown":
                result *= 10;
                break;
            case "red":
                result *= 100;
                break;
            case "orange":
                result *= 1000;
                break;
            case "yellow":
                result *= 10000;
                break;
            case "green":
                result *= 100000;
                break;
            case "blue":
                result *= 1000000;
                break;
            case "violet":
                result *= 10000000;
                break;
            case "grey":
                result *= 100000000;
                break;
            case "white":
                result *= 1000000000;
                break;
        }
    }
}
