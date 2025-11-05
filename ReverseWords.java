public class ReverseWords {
    
    public static void main(String[] args) {
        String s = "This   is simple  java ";
        String ans = "";

        String[] str = s.split(" ");
        for(int i =str.length-1;i>=0;i--){
            ans += str[i] +" ";
        }
        String answer = ans.trim().replaceAll("\\s+", " ");
        System.out.println(answer);
    }
}
