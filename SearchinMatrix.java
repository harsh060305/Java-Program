public class SearchinMatrix {

    //In this the matrix is sorted in row wise and column wise order
    public static boolean staircase(int[][] arr,int key){
        int row=0,col=arr[0].length-1;
        
        while(row<arr.length && col>=0){
            if(arr[row][col]==key){
                System.out.print("key found at index ("+row+","+col+")");
                return true;
            }else if(arr[row][col]<key){
                row++;
            }else{
                col--;
            }
        }System.out.print("key not found!");
        return false;

    }
    public static void main(String[] args) {
        int[][] arr={{10,20,30,40},{12,22,34,44},{16,26,36,46},{18,28,38,48}};
        int key=28;
        staircase(arr,key);
    }
    
}
