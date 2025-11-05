public class ToggleChars {
    public static void main(String[] args) {
        String s="aBc12#";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a' && c<='z'){
                System.out.print((char)(c+ 'A' - 'a'));
            }
            else if(c>='A' && c<='Z'){
                System.out.print((char)(c+ 'a' - 'A'));
            }else System.out.print(c);
        }
    }

}
