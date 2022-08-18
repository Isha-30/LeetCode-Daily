class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        for(int n : arr){
            freq.put(n, freq.getOrDefault(n, 0)+1);
        }
        
        if(freq.size() == 1)
                return 1;
        if(freq.size() == arr.length)
            return arr.length/2;
        
        PriorityQueue<Integer> maxFreq = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : freq.keySet()){
            maxFreq.add(freq.get(n));
        }
        
        int size = arr.length;
        int count = 0;
        while(size > arr.length/2){
            size -= maxFreq.poll();
            count++;
        }
        return count;
    }
}
