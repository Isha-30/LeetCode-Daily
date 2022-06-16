class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n<2)
            return s;
        int maxLen = 1, start =0;
        int low, high;
        
        //iterate through string
        for(int i= 0; i<n;i++){
            low = i-1;
            high = i+1;
            while(high<n && s.charAt(high)==s.charAt(i))
                high++; //check on right
            while(low>=0 && s.charAt(low) == s.charAt(i))
                low--; // check on left
            while(low>=0 && high < n && s.charAt(low) == s.charAt(high)){
                low--; high++;
            }
            int length = high-low-1;
            if(maxLen < length)
            {
                maxLen = length;
                start = low+1;
            }
        }
        return s.substring(start, start+maxLen);
    }
}
