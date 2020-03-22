import java.util.Scanner;

public class Baekjun_9610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int point = sc.nextInt();
        int q1=0, q2=0, q3=0, q4=0, axis=0;
        for(int i=0; i<point; i++){
            int xpos = sc.nextInt();
            int ypos = sc.nextInt();
            if(xpos==0 || ypos==0) axis++;
            else if(xpos>0 && ypos>0) q1++;
            else if(xpos<0 && ypos>0) q2++;
            else if(xpos<0 && ypos<0) q3++;
            else if(xpos>0 && ypos<0) q4++;
        }
        System.out.println("Q1: " + q1);
        System.out.println("Q2: " + q2);
        System.out.println("Q3: " + q3);
        System.out.println("Q4: " + q4);
        System.out.println("AXIS: " + axis);
    }
}
