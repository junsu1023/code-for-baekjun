public class Baekjun_4690 {
    public static void main(String[] args) {
        for(int i=2; i<=100; ++i){
            for(int j=2; j<i; ++j){
                for(int k=j+1; k<i; ++k){
                    for(int x=k+1; x<i; ++x){
                        if(solve(i)==solve(j)+solve(k)+solve(x)){
                            System.out.println("Cube = " + i +", Triple = (" + j +"," + k + "," + x +")");
                        }
                    }
                }
            }
        }
    }
    public static int solve(int a){
        return a*a*a;
    }
}
