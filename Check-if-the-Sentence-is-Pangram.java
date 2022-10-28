class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Integer> set = new HashSet<>();
        for(char ch : sentence.toCharArray())
            set.add(ch - 'a');

        for(int i = 0; i<26; i++){
            if(!set.contains(i))
                return false;
        }
        return true;
    }
}
