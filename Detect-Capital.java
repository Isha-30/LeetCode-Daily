class Solution {
    public boolean detectCapitalUse(String word) {
        int caps = 0, small = 0;
        if(word.length()==1) return true;
        
        else if(word.charAt(0)>='a' && word.charAt(0)<='z'){
            for(int i = 1; i<word.length(); i++){
                if(word.charAt(i)>='A' && word.charAt(i)<='Z')
                    return false;
            }
        }
        else if(word.charAt(0)>='A' && word.charAt(0)<='Z'){
            caps=1;
            for(int i =1; i<word.length(); i++){
                if(word.charAt(i)>='a' && word.charAt(i)<='z')
                    small++;
                else if(word.charAt(i)>='A' && word.charAt(i)<='Z' && small>0)
                    return false;
                else if(word.charAt(i)>='A' && word.charAt(i)<='Z')
                    caps++;
                else if(word.charAt(i)>='a' && word.charAt(i)<='z' && caps>=2)
                    return false;
            }
        }
        if(caps>1 && small>0)
            return false;
        else
            return true;
    }
}
