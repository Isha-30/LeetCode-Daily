class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<>();
        String[] dot = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(String word : words){
            String str = "";
            for(int i = 0; i<word.length();i++)
                str += dot[word.charAt(i) - 'a'];
            set.add(str);
        }
        return set.size();
    }
}
