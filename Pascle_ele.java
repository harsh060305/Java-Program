
public class Pascle_ele {

    public static int nCr(int n,int r){
        int res=1;
        for (int i = 0; i < r; i++) {
            res=res*(n-i);
            res=res/(i+1);
            
        }return res;
    }

    public static int pascle(int r,int c){
        int element = (int)nCr(r-1,c-1);
        return element;
    }
    public static void main (String[] args) {
        int r=5;
        int c=3;
        
        int result=pascle(r,c);
        System.out.println("Element is "+result);
    }
    /*
     * List<Integer> res = new ArrayList<>();
        long val=1;
        for(int j=0;j<=rowIndex;j++){
            res.add((int)val);
            val=val*(rowIndex-j)/(j+1);
        }return res;
     */
    
}
