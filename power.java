public class power {
    //calc power using recursion

    public static int power(int n,int p){
        int pow;
        if(p==0){
            return 1;
        }
        int halfpow=power(n,p/2);
        pow=halfpow*halfpow;

        if(p%2!=0){
            pow=n*pow;
        }return pow;
    }
    public static void main(String[] args) {
        int n=2;
        int p=10;
        System.out.println(power(n,p));;
    }
}
