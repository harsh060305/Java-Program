public class RotateString {
    public static void main(String[] args) {
        String s="abcde";
        String goal="deabc";
        if(s.length()!=goal.length()) System.out.println("Not rotated");
        if((s+s).contains(goal)) System.out.println("Rotated");

    }
}
