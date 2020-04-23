public class Baekjun_6679 {
    public static void main(String[] args){
        for(int i=1000; i<10000; i++){
            int ten = 0;
            int twe = 0;
            int hex = 0;
            for(int j=i; j>0; j/=10) ten += j % 10;
            for(int j=i; j>0; j/=12) twe += j % 12;
            for(int j=i; j>0; j/=16) hex += j % 16;
            if(ten == twe && twe == hex) System.out.println(i);
        }
    }
}
