class Solution {
    public String breakPalindrome(String palindrome) {
        String newStr = "";
        if(palindrome.length()==1){
            return newStr;
        }
        for(int i =0;i<palindrome.length()/2;i++){
            char curr = palindrome.charAt(i);
            if(curr != 'a'){
                newStr = palindrome.substring(0,i)+'a'+palindrome.substring(i+1);
                
                return newStr;
            }
        }
        
        newStr = palindrome.substring(0,palindrome.length()-1)+'b';
        return newStr;
    }
}
