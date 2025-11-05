class CheckPanagram {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        boolean[] freq = new boolean[26];
        for(int i=0;i<sentence.length();i++){
            char ch =  sentence.charAt(i);
            int val = ch-'a';
            freq[val]=true;
        }
        for(boolean b : freq){
            if(!b){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        CheckPanagram obj = new CheckPanagram();
        boolean b = obj.checkIfPangram(sentence);
        
        System.out.println(b);
    }
}