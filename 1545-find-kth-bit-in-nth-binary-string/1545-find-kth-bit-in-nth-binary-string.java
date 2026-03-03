class Solution {
    public char findKthBit(int n, int k) {
        if(n == 1) return '0';
        
        int L = (int)Math.pow(2, n) - 1;
        int mid = L/2 + 1;
        
        if(k == mid) return '1';
        else if(k < mid) return findKthBit(n-1, k);
        else {
            char bit = findKthBit(n-1, L+1-k);
            return bit == '1' ? '0' : '1';
        }
    }
}