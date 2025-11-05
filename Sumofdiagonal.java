public class Sumofdiagonal {
    //time complexity = O(n)
    public static int matrix(int[][] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i][i];//for primary diagonal
            sum+=arr[i][arr.length-1-i]; //for secondary diagonal
            
        }return sum;
    }

     //time complexity=O(n2)
     /*
    public static int matrix(int[][] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length ; j++) {
                if(i==j || (i+j) ==arr.length-1){
                    sum = sum+ arr[i][j];
                }
                
            }
            
        }return sum;
    }*/
    public static void main(String[] args) {
        int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(matrix(arr));
    }
}
