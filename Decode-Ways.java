class Solution {
    public int numDecodings(String s) {
        int curr=1, prev=0, n=s.length();
        
        for(int i=n-1;i>=0;i--) {
            int sum;
            if(s.charAt(i) == '0')
                sum = 0;
            else
                sum = curr;
            if(i<n-1 && (s.charAt(i)=='1'||s.charAt(i)=='2' && s.charAt(i+1)<'7'))
                sum += prev; //considering 2 digits
            
            //swap for space optimization
            prev = curr;
            curr = sum;
        }
        return curr;
    }
}
