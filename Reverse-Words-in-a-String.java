class Solution {
    public String reverseWords(String A) {
        Stack<String> st = new Stack<>();
        String res = "";
        int j=0;
        while(j<A.length()){
            if(A.charAt(j) == ' '){
                j++;
            }
            else
                break;
        }   
        for(int i=j;i<A.length();i++){
            if(A.charAt(i)!= ' '){
                res = res+A.charAt(i);
            }else{
                if(res != "")
                    st.push(res);
                res="";
            }
        }
        if(res != "")
            st.push(res);
        res="";
        res = res + st.pop();
        while(!st.isEmpty()){
            res = res+ " " + st.pop();
        }
        return res;
    }
}
