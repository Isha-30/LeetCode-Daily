class Solution {
    public int firstUniqChar(String s) {
        int[] alp =new int[26];
        char[] arr =s.toCharArray();
    
        for(char c : arr ){
            alp[c-'a']++;
        }

        for(int i=0;i<arr.length;i++){
            if (alp[arr[i]-'a']==1) return i;
        }

        return -1;
    }
}
