class Data {
    String val;
    int time;
    Data(String val, int time) {
        this.val = val;
        this.time = time;
    }
}
class TimeMap {

    /** Initialize your data structure here. */
    Map<String, List<Data>> map;
    public TimeMap() {
        map = new HashMap<String, List<Data>>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) map.put(key, new ArrayList<Data>());
        map.get(key).add(new Data(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";
        return binarySearch(map.get(key), timestamp);
    }
    
    protected String binarySearch(List<Data> list, int timestamp) {
        int start = 0;
        int end = list.size() - 1;
        int idx = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (list.get(mid).time <= timestamp) {
                idx = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return idx != -1 ? list.get(idx).val : "";
    }
}
