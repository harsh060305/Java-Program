public class PushZeroToEnd {

    void pushZerosToEnd(int[] arr) {
        
        
        int k=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[k]=arr[i];
                k++;
            }
        }
        for(int i=k;i<arr.length;i++){
            arr[i]=0;
        }
    }
    public static void main(String[] args) {
    PushZeroToEnd s = new PushZeroToEnd();
    int[] arr = {0, 1, 0, 3, 12};
    s.pushZerosToEnd(arr);
    for (int num : arr) System.out.print(num + " ");
    }


}
