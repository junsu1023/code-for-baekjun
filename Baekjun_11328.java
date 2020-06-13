    import java.util.Scanner;

    public class Baekjun_11328 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i=0; i<n; i++){
                String w1 = sc.next();
                String w2 = sc.next();
                char[] alpha1 = new char[27];
                char[] alpha2 = new char[27];
                boolean flag = true;
                if(w1.length()==w2.length()){
                    for(int j=0; j<w1.length(); j++){
                        alpha1[w1.charAt(j) - 97]++;
                        alpha2[w2.charAt(j) - 97]++;
                    }
                    for(int j=0; j<27; j++){
                        if(alpha1[j]!=alpha2[j]){
                            flag = false;
                            break;
                        }
                    }
                }
                else{
                    flag = false;
                }
                if(flag) System.out.println("Possible");
                else System.out.println("Impossible");
            }
        }
    }
