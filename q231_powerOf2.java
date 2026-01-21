//optimal using AND gate
class Solution { public boolean isPowerOfTwo(int n) { return n > 0 && (n & (n - 1)) == 0; } }

//Common solution even same for power of 3,4
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }
}
