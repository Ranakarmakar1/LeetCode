class Solution {
    public char findKthBit(int n, int k) {
        // Base case: S1 is "0"
        if (n == 1) {
            return '0';
        }
        
        // Find the length of Sn
        int length = (1 << n) - 1; // 2^n - 1
        
        // Middle position of the current string Sn
        int mid = length / 2 + 1;
        
        if (k == mid) {
            return '1'; // The middle bit is always '1'
        } else if (k < mid) {
            return findKthBit(n - 1, k); // In the first half
        } else {
            // In the second half, reverse and invert, so look at the mirrored position
            return invert(findKthBit(n - 1, length - k + 1)); 
        }
    }
    
    private char invert(char bit) {
        return bit == '0' ? '1' : '0'; // Invert the bit
    }
}
