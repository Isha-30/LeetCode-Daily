class Solution {
    public String reverseWords(String s) {
        if(s.length() == 1)
            return s;
        
        int n = s.length(), i=0;
        char[] arr = s.toCharArray();
        for(int j = 0; j<n; j++){
            if(arr[j] == ' '){
                reverse(arr, i, j-1);
                i = j+1;
            }
        }
        reverse(arr, i, n-1);
        return new String(arr);
    }
    
    private void reverse(char[] s, int i, int j){
        while(i<=j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        
    }
}
