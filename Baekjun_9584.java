import java.util.Scanner;

public class Baekjun_9584 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String problem = sc.nextLine();
        int test_case = sc.nextInt();
        int count = 0;
        sc.nextLine();
        for(int tc=0; tc<test_case; tc++){
            boolean check = true;
            String sentence = sc.nextLine();
            for(int i=0; i<problem.length(); i++){
                if(problem.charAt(i)!='*' && (problem.charAt(i)!=sentence.charAt(i))) check = false;
            }
            if(check){
                count++;
                sb.append(sentence + "\n");
            }
        }
        System.out.println(count);
        System.out.println(sb);
    }
}
