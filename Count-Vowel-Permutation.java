class Solution {
    public int countVowelPermutation(int n) {
        long a = 1, e = 1, i = 1, o = 1, u = 1;
        for (int k = 1; k < n; k++) {
            long tmpa = (u + i + e) % 1000000007;//a can follow e, u and i
            long tmpe = (a + i) % 1000000007;//e can follow a and i
            long tmpi = (e + o) % 1000000007;//i can follow e and o
            long tmpo = i; // o can follow i
            long tmpu = (o + i) % 1000000007;//u can follow o and i
            a = tmpa;
            e = tmpe;
            i = tmpi;
            o = tmpo;
            u = tmpu;
        }
        int ans = (int)((a + e + i + o + u) % 1000000007);
        return ans;
    }
}
