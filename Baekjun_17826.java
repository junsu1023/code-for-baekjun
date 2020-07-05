import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_17826 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[50];
        for(int i=0; i<50; i++) score[i] = sc.nextInt();
        int hongik = sc.nextInt();
        int grade = 0;
        String gr = "";
        Arrays.sort(score);
        for(int i=0; i<score.length; i++){
            if(score[i] == hongik) grade = 50-i;
        }
        if(grade>=1 && grade<=5) gr = "A+";
        else if(grade>5 && grade<=15) gr = "A0";
        else if(grade>15 && grade<=30) gr = "B+";
        else if(grade>30 && grade<=35) gr = "B0";
        else if(grade>35 && grade<=45) gr = "C+";
        else if(grade>45 && grade<=48) gr = "C0";
        else gr = "F";
        System.out.println(gr);
    }
}
