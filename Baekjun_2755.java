import java.util.Scanner;

public class Baekjun_2755 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        float n = sc.nextInt();
        int total_time = 0;
        float total_grade = 0;
        for(int i=0; i<n; i++){
            String subject = sc.next();
            int time = sc.nextInt();
            String grade = sc.next();
            total_time += time;
            if(grade.equals("A+")) total_grade+=(double)time*4.3;
            if(grade.equals("A0")) total_grade+=(double)time*4.0;
            if(grade.equals("A-")) total_grade+=(double)time*3.7;
            if(grade.equals("B+")) total_grade+=(double)time*3.3;
            if(grade.equals("B0")) total_grade+=(double)time*3.0;
            if(grade.equals("B-")) total_grade+=(double)time*2.7;
            if(grade.equals("C+")) total_grade+=(double)time*2.3;
            if(grade.equals("C0")) total_grade+=(double)time*2.0;
            if(grade.equals("C-")) total_grade+=(double)time*1.7;
            if(grade.equals("D+")) total_grade+=(double)time*1.3;
            if(grade.equals("D0")) total_grade+=(double)time*1.0;
            if(grade.equals("D-")) total_grade+=(double)time*0.7;
            if(grade.equals("F")) total_grade+=(double)time*0.0;
        }
        System.out.printf("%.2f", total_grade/total_time);
    }
}
