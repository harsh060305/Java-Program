import java.util.*;

public class Transpose_of_matrix {

//without using extra variable(for square matrix)
public static void transpose(int[][] arr,int r,int c){
    int temp;
    for (int i = 0; i < r; i++) {
        for (int j = i+1; j < r; j++) {
            temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
    }
    for (int x = 0; x < c; x++) {
        for (int y = 0; y < r; y++) {
            System.out.print(arr[x][y]);

        }System.out.println();
    }
}


/*
    //transpose using extra variable
    public static void transpose(int[][] arr,int r,int c){
        int[][] temp=new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                temp[i][j]=arr[j][i];
            }
            
        }for (int x = 0; x < c; x++) {
            for (int y = 0; y < r; y++) {
                System.out.print(temp[x][y]);

            }System.out.println();
            
        }
    }*/

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of row : ");
        int r =sc.nextInt();
        System.out.println("Enter the size of column : ");
        int c = sc.nextInt();
        System.out.println("Enter the element of matrix : ");
        int arr[][]=new int[r][c];
        for (int i = 0; i < r; i++) {
            for(int j = 0;j<c ; j++){
                arr[i][j]=sc.nextInt();
            }
            
        }transpose(arr,r,c);
        
    }
    
}
