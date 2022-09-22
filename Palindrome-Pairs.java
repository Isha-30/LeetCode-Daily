class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<words.length; ++i){
            map.put(new StringBuilder(words[i]).reverse().toString(), i);
        }
        
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i=0; i<words.length; ++i){
            String curr = words[i];
            for(int j=0; j<=curr.length(); ++j){
                String prefix = curr.substring(0, j);
                String suffix = curr.substring(j);
                
                if(map.containsKey(prefix) && map.get(prefix)!= i && isPalindrome(suffix))
                    result.add(Arrays.asList(i, map.get(prefix)));
                
                if(!prefix.isEmpty() && map.containsKey(suffix) && map.get(suffix)!=i && isPalindrome(prefix))
                    result.add(Arrays.asList(map.get(suffix), i));   
                
            }
        }
        
        return result;
    }
    
    private boolean isPalindrome(String str){
        if(null == str || str.length() <= 1) 
            return true;
        int i=0, j = str.length()-1;
        while(i<j){
            if(str.charAt(i++) != str.charAt(j--)) 
                return false;
        }
        return true;
    }

}
