public class Mirror_Upper_Star_Triangle{
    public static void main(String[] args) {
        int n=5;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for( int k=i;k<n;k++)
            {
                System.out.print("* ");
            }System.out.println();
            
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int k=i;k<n;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }System.out.println();
        }
    }
}