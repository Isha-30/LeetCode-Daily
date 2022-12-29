class Solution {
    public int numTilings(int n) {
        int a = 1, b = 1, c = 2, d;
        while (--n > 0) {
            d = (2 * c % 1000000007 + a) % 1000000007;
            a = b;
            b = c;
            c = d;
        }
        return b;
    }
}
