/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new LinkedList<>();
        
        if (root == null) 
            return res;
        
        Queue<Node> q = new LinkedList<>();
        
        q.offer(root);
        
        while (!q.isEmpty()) {
            List<Integer> curLevel = new LinkedList<>();
            
            int len = q.size();
            
            for (int i = 0; i < len; i++) {
                Node curr = q.poll();
                curLevel.add(curr.val);
                for (Node c : curr.children)
                    q.add(c);
            }
            
            res.add(curLevel);
        }
        
        return res;
    }
}
