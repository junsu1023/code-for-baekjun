import java.util.Scanner;

public class Baekjun_2754 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String grade = sc.nextLine();
        double sum = 0;
        for(int i=0; i<grade.length(); i++){
            switch(grade.charAt(i)){
                case 'A':
                    sum+=4;
                    break;
                case 'B':
                    sum+=3;
                    break;
                case 'C':
                    sum+=2;
                    break;
                case 'D':
                    sum+=1;
                    break;
                case '+':
                    sum+=0.3;
                    break;
                case '-':
                    sum-=0.3;
                    break;
            }
        }
        System.out.println(sum);
    }
}
