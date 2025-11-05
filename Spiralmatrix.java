public class Spiralmatrix {

    public static void matrix(int[][] arr){
        int startrow=0,endrow=arr.length-1;
        int startcolumn=0,endcolumn=arr.length-1;

        while(startrow<=endrow && startcolumn <= endcolumn){
            for(int j=startcolumn;j<=endcolumn;j++){ //column print first
                System.out.print(arr[startrow][j]+" ");
            }for (int i = startrow+1; i <= endrow; i++) {//row print after first column
                System.out.print(arr[i][endcolumn]+" ");
            }for (int j =endcolumn-1; j >= startcolumn; j--) {
                System.out.print(arr[endrow][j]+" ");
            }for (int i = endrow-1; i > startrow; i--){
                System.out.print(arr[i][startcolumn]+" ");
            }
            startrow++;
            startcolumn++;
            endrow--;
            endcolumn--;
        }
        
    }
    public static void main(String[] args) {
        int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        matrix(arr);
    }
    
}
