public class Tilingproblem {
    //size of floor given in the form of 2*n
    //size of tile is 2*1
    //arrange the tile in the floor 
    public static int tile(int n){ //size of floor is 2*n
        if(n==0||n==1){
            return 1;
        }
        //arrange vertically
        int fnm1=tile(n-1);

        //arrange horizontal
        int fnm2=tile(n-2);

        return fnm1+fnm2;
    }

    public static void main(String[] args) {
        System.out.println(tile(3));//size of floor is 2*3
    }
    
}
